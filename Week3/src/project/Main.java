package project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) throws Exception{
		Main m=new Main();
		m.serializeObjects();//serializing the objects to input.txt
		ArrayList<Student> students=m.readObjects();//reading serialized objects form input.txt
		
		System.out.println("\nBefore processing the student objects\n");
		students.forEach(System.out::println);
		m.processObjects(students);//process the objects
		System.out.println("\nAfter processing the student objects\n");
		students.forEach(System.out::println);
		
		m.writeObjects(students);//serializing the processed objects to output.txt
		m.deSerializeObjects();//de-serializing the output.txt and printing
	}
	
	

	private void deSerializeObjects() throws Exception {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("input.txt"));
		ArrayList<Student> students=new ArrayList<>();
		
		while(true) {
			try {
				students.add((Student)ois.readObject());	
			}
			catch(Exception e) {
				break;
			}
		}
		
		ois.close();
		
	}



	public void serializeObjects()throws Exception {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("input.txt"));
		
		 
		oos.writeObject(new Student(101, "Alice",    new int[]{85, 90, 78, 92, 88}));
        oos.writeObject(new Student(102, "Bob",      new int[]{76, 84, 91, 87, 79}));
        oos.writeObject(new Student(103, "Charlie",  new int[]{92, 88, 85, 90, 83}));
        oos.writeObject(new Student(104, "David",    new int[]{8, 7, 88, 92, 76}));
        oos.writeObject(new Student(105, "Eve",      new int[]{9, 85, 87, 84, 89}));
        oos.writeObject(new Student(106, "Frank",    new int[]{78, 92, 80, 75, 88}));
        oos.writeObject(new Student(107, "Grace",    new int[]{85, 8, 91, 90, 80}));
        oos.writeObject(new Student(108, "Hank",     new int[]{88, 76, 85, 92, 81}));
        oos.writeObject(new Student(109, "Ivy",      new int[]{91, 84, 87, 78, 85}));
        oos.writeObject(new Student(110, "Jack",     new int[]{79, 90, 88, 84, 76}));
        oos.writeObject(new Student(111, "Kate",     new int[]{85, 87, 90, 81, 83}));
        oos.writeObject(new Student(112, "Leo",      new int[]{92, 89, 78, 85, 84}));
        oos.writeObject(new Student(113, "Mia",      new int[]{80, 85, 88, 90, 87}));
        oos.writeObject(new Student(114, "Nick",     new int[]{76, 92, 81, 84, 79}));
        oos.writeObject(new Student(115, "Olivia",   new int[]{89, 9, 85, 87, 92}));
        oos.writeObject(new Student(116, "Paul",     new int[]{84, 78, 92, 85, 88}));
        oos.writeObject(new Student(117, "Quinn",    new int[]{87, 85, 90, 88, 84}));
        oos.writeObject(new Student(118, "Ryan",     new int[]{91, 79, 85, 92, 76}));
        oos.writeObject(new Student(119, "Sophia",   new int[]{8, 8, 9, 90, 80}));
        oos.writeObject(new Student(120, "Tom",      new int[]{88, 76, 85, 9, 8}));
        
        oos.flush();
        oos.close();
	}
	
	public ArrayList<Student> readObjects() throws Exception{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("input.txt"));
		ArrayList<Student> students=new ArrayList<>();
		
		while(true) {
			try {
				students.add((Student)ois.readObject());	
			}
			catch(Exception e) {
				break;
			}
		}
		
		ois.close();
		return students;
		
	}
	
	public void writeObjects(ArrayList<Student> students) throws Exception{
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("output.txt"));
		for(Student s:students) {
			oos.writeObject(s);
		}
		
		oos.close();
	}
	
	public void processObjects(ArrayList<Student> students){
		ExecutorService executor=Executors.newFixedThreadPool(5);
		
		for(Student s:students) {
			executor.execute(()->{
				int[] marks=s.getMarks();
				int sum=Arrays.stream(marks).sum();
				
				if(sum>400) {
					s.setGrade("A");
				}
				else if(sum>300) {
					s.setGrade("B");
				}
				else if(sum>200) {
					s.setGrade("c");
				}
				else {
					s.setGrade("F");
				}
				
			});
		}
		
//		students.forEach((s)->System.out.println(s));
		
	}
	
	
}
