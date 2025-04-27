package com.StudentCourseManagementSystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;

import exceptions.CourseNotFoundException;
import exceptions.DuplicateCourseRegistrationException;
import exceptions.InvalidCourseRegistrationException;
import exceptions.InvalidStudentRegistrationException;
import exceptions.RegistrationLimitExceededException;
import exceptions.StudentNotFoundException;

public class Institute implements CourseManagementSystem {

	private Map<Integer, Student> students;
	private Map<Integer, Course> courses;
	public static int MAX_REG_COUNT = 3;

	Institute() {
		try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/main/java/objects.ser"))){
			students = (Map<Integer, Student>) ois.readObject();
			courses = (Map<Integer, Course>) ois.readObject();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	// register a new Student
	public boolean registerNewStudent(String name, int age) throws InvalidStudentRegistrationException {
		int generatedId = FileUtility.getStudentId();
		Student student = new Student(generatedId, name, age, new ArrayList<Course>());
		if (students.containsKey(generatedId)) {
			throw new InvalidStudentRegistrationException("Student already found");
		} else {
			students.put(generatedId, student);
			System.out.println(student);
			return true;
		}
	}

	// remove a student
	public boolean removeStudent(int id) throws StudentNotFoundException {
		if (students.containsKey(id)) {
			students.remove(id);
			return true;
		} else {
			throw new StudentNotFoundException("student not found");
		}
	}

	// update a student
	public boolean updateStudent(int id, String name, int age) {
		Student student = getStudentById(id);
		if (student != null) {
			student.setName(name);
			student.setAge(age);
			return true;
		} else {
			return false;
		}

	}

	// get Student by id
	public Student getStudentById(int id) {
		if (students.containsKey(id)) {
			return students.get(id);
		} else {
			return null;
		}
	}

	// list all students
	public void printStudents() {
		System.out.println("Students : ");
		for (Integer i : students.keySet()) {
			System.out.println(students.get(i));
		}
	}

	// register a new course
	public boolean registerNewCourse(String name, double fee, int duration) throws InvalidCourseRegistrationException {
		int genId = FileUtility.getCourseId();

		Course course = new Course(genId, name, fee, duration);
		if (courses.containsKey(genId)) {
			throw new InvalidCourseRegistrationException("Course already found");
		} else {
			courses.put(genId, course);
			System.out.println(course);
			return true;
		}
	}

	// remove course
	public boolean removeCourse(int id) throws CourseNotFoundException {

		if (courses.containsKey(id)) {
			courses.remove(id);
			return true;
		} else {
			throw new CourseNotFoundException("course not found");
		}
	}

	// get course by id
	public Course getCourseById(int id) {
		if (courses.containsKey(id)) {
			return courses.get(id);
		} else {
			return null;
		}
	}

	// list all courses
	public void printCourses() {
		System.out.println("Courses : ");
		for (Integer i : courses.keySet()) {
			System.out.println(courses.get(i));
		}
	}

	// update a course
	public boolean updateCourse(int id, String name, double fee, int duration) {
		Course course = getCourseById(id);
		if (course != null) {
			course.setName(name);
			course.setFee(fee);
			course.setDuration(duration);
			return true;
		} else {
			return false;
		}

	}
	
	//assign course to a student
	public boolean assignCourseToStudent(int sid,int cid) throws StudentNotFoundException, CourseNotFoundException, RegistrationLimitExceededException, DuplicateCourseRegistrationException {
		Student student =getStudentById(sid);
		if(student==null) {
			throw new StudentNotFoundException("student not found");
		}
		
		Course course = getCourseById(cid);
		
		if(course==null) {
			throw new CourseNotFoundException("Course not found");
		}
		
		if(student != null && course != null) {
			ArrayList<Course> registeredCourses = (ArrayList<Course>) getStudentById(sid).getRegisteredCources();
			for(Course c: registeredCourses) {
				if(c.getId()==cid) {
					throw new DuplicateCourseRegistrationException("course already registered");
				}
			}
		}
		
		if(student!=null&&course!=null) {
			if(student.getRegisteredCources().size() < Institute.MAX_REG_COUNT) {
				return student.getRegisteredCources().add(course);
			}
			else {
				throw new RegistrationLimitExceededException("course registration limit exceeded");
			}
		}
		
		return false;
	}

	public void serializeObjects() {
		try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/main/java/objects.ser"))){
			oos.writeObject(students);
			oos.writeObject(courses);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
