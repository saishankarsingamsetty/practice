package com.StudentCourseManagementSystem;

import java.util.Scanner;

import exceptions.CourseNotFoundException;
import exceptions.DuplicateCourseRegistrationException;
import exceptions.InvalidCourseRegistrationException;
import exceptions.InvalidStudentRegistrationException;
import exceptions.RegistrationLimitExceededException;
import exceptions.StudentNotFoundException;

public class Main {

	public static void main(String[] args) {
		Institute institute = new Institute();
		Scanner scn = new Scanner(System.in);

		loop: while (true) {
			System.out.println();
			System.out.println("1.Add a student");
			System.out.println("2.Remove a student");
			System.out.println("3.Update a student");
			System.out.println("4.view all students");
			System.out.println("5.Add a course");
			System.out.println("6.Remove a course");
			System.out.println("7.Update a course");
			System.out.println("8.view all courses");
			System.out.println("9.assign course to a student");
			System.out.println("10.Exit");

			int option = Integer.parseInt(scn.nextLine());

			switch (option) {
			case 1: {
				// add a student
				System.out.println("Enter Student name");
				String name = scn.nextLine();
				System.out.println("Enter the student age");
				int age = Integer.parseInt(scn.nextLine());

				try {
					if (institute.registerNewStudent(name, age)) {
						System.out.println("Student registered successfully");
					} else {
						System.out.println("student registration failure");
					}
				} catch (InvalidStudentRegistrationException e) {
					System.out.println(e.getMessage());
				}

				break;
			}

			case 2: {
				// remove a student
				System.out.println("Enter the student id  you want to delete");
				int id = Integer.parseInt(scn.nextLine());

				try {
					institute.removeStudent(id);
					System.out.println("student remove successfully");
				} catch (StudentNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case 3: {
				// update a student
				System.out.println("enter the id of the student to update");
				int id = Integer.parseInt(scn.nextLine());
				System.out.println("enter the new name");
				String name = scn.nextLine();
				System.out.println("enter the new age");
				int age = Integer.parseInt(scn.nextLine());

				if (institute.updateStudent(id, name, age)) {
					System.out.println("update success");
				} else {
					System.out.println("update failure");
				}
				break;
			}
			case 4: {
				// view all students
				institute.printStudents();
				break;
			}
			case 5: {
				// add a course
				System.out.println("enter  the course name ");
				String name = scn.nextLine();
				System.out.println("enter the course fee");
				double fee = Double.parseDouble(scn.nextLine());
				System.out.println("enter the course duration");
				int duration = Integer.parseInt(scn.nextLine());
				try {
					if (institute.registerNewCourse(name, fee, duration)) {
						System.out.println("course registered successfully");
					} else {
						System.out.println("course registration failure");
					}
				} catch (InvalidCourseRegistrationException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case 6: {
				// remove a course
				System.out.println("enter the course id you want to delete");
				int id = Integer.parseInt(scn.nextLine());

				try {
					if (institute.removeCourse(id)) {
						System.out.println("course removed");
					} else {
						System.out.println("course not removed");
					}
				} catch (CourseNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			}

			case 7: {
				// update a course
				System.out.println("enter the id you want to update");
				int id = Integer.parseInt(scn.nextLine());
				System.out.println("enter the updated name");
				String name = scn.nextLine();
				System.out.println("enter the updated fee");
				double fee = Double.parseDouble(scn.nextLine());
				System.out.println("enter the duration ");
				int duration = Integer.parseInt(scn.nextLine());

				if (institute.updateCourse(id, name, fee, duration)) {
					System.out.println("course updated");
				} else {
					System.out.println("course not updated");
				}
				break;
			}
			case 8: {
				// view all the courses
				institute.printCourses();
				break;
			}
			case 9: {
				// assign course to a student
				System.out.println("enter the student id");
				int sid = Integer.parseInt(scn.nextLine());

				System.out.println("enter the course id you want to assign");
				int cid = Integer.parseInt(scn.nextLine());
				try {
					if(institute.assignCourseToStudent(sid, cid)) {
						System.out.println("course added successfully");
					}
					else {
						System.out.println("course not added ");
					}
				}
				catch(RegistrationLimitExceededException e) {
					System.out.println(e.getMessage());
				}
				catch(StudentNotFoundException e) {
					System.out.println(e.getMessage());
				}
				catch(CourseNotFoundException e) {
					System.out.println(e.getMessage());
				}
				catch(DuplicateCourseRegistrationException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case 10:
				// Exit
				scn.close();
				institute.serializeObjects();
				break loop;

			default:
				System.out.println("choose a valid option");
			}
		}

	}

}
