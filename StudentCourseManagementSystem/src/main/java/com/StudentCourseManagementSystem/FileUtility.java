package com.StudentCourseManagementSystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUtility {

	public static int getStudentId() {
		try (
			Scanner scn=new Scanner(new File("src/main/java/studentidfile.txt"));){
			int id=scn.nextInt();
			updateStudentId(id);
			return id;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	private static void updateStudentId(int oldId) {
		try (
			BufferedWriter writer= new BufferedWriter(new FileWriter("src/main/java/studentidfile.txt"));){
			writer.write(String.valueOf(oldId+1));
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static int getCourseId() {
		try (
			Scanner scn=new Scanner(new File("src/main/java/courseidfile.txt"));){
			int id=scn.nextInt();
			updateCourseId(id);
			return id;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	private static void updateCourseId(int oldId) {
		try (
			BufferedWriter writer= new BufferedWriter(new FileWriter("src/main/java/courseidfile.txt"));){
			writer.write(String.valueOf(oldId+1));
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
