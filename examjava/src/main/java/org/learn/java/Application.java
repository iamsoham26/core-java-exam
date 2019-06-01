package org.learn.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class Application {
	
	static {
		System.out.println("CORE JAVA EXAM");
	}

	public static void main(String[] args) {
		//TODO: create a list of students (may be five items)
		
		Address permanentAddress = new Address(1,"This Society","Apt 18","Ahmedabad","Gujarat",380061);
		Address permanentAddress1 = new Address(2,"Their Society","Apt 1","Baroda","Gujarat",386061);
		Address permanentAddress2 = new Address(3,"Thus Society","Apt 10","Jaipur","Rajsthan",4061);
		Address permanentAddress3 = new Address(4,"Those Society","Apt 13","Gangtok","Sikkim",3800);
		Address permanentAddress4 = new Address(5,"That Society","Apt 12","Shreenagar","JNK",381);
		
		Address mailingAddress = new Address(1,"This Society","Ahmedabad","Gujarat",380061);
		Address mailingAddress1 = new Address(2,"Their Society","Baroda","Gujarat",386061);
		Address mailingAddress2 = new Address(3,"Thus Society","Jaipur","Rajsthan",4061);
		Address mailingAddress3 = new Address(4,"Those Society","Gangtok","Sikkim",3800);
		Address mailingAddress4 = new Address(5,"That Society","Shreenagar","JNK",381);

		List<Student> studentList = Arrays.asList(new Student[]{
			new Student("Soham","Joshi",permanentAddress1,mailingAddress),
			new Student("Deep","Raval",permanentAddress2,mailingAddress1),
			new Student("Ravi","Prajapati",permanentAddress3,mailingAddress2),
			new Student("Ravi","Joshi",permanentAddress4,mailingAddress3),
			new Student("Emnem","Emnem",permanentAddress,mailingAddress4)
		});
		
		studentList.forEach(System.out::println);
		
		//TODO: sort the list using last name of the student
		
		System.out.println("Student's List sorted by last name");
		Collections.sort(studentList);
		studentList.forEach(System.out::println);
		
		//TODO: sort the list using the zip code of the mailing address
		
		System.out.println("Student's list sorted by zipcode");
		
		Collections.sort(studentList, (x, y) -> x.getMailingAddress().zipcode.compareTo(y.getMailingAddress().zipcode));
		studentList.forEach(System.out::println);
		
		//TODO: find a student(s) by the last name which contain a given string
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Search by Last Name....");
		str = sc.nextLine();
		
		for(Student x: studentList){
			if(x.getLastName().contains(str)){
				System.out.println(x);
			}
		}
		
		//TODO: create a set of students (may be five items) where unique student should be defined by their
		//1)last name, 2)first name and 3)permanent address
		
		Set<Student> studentSet = new HashSet<>();
		for(Student x: studentList){
			studentSet.add(x);
		}
		studentSet.forEach(System.out::println);
		
		//TODO: remove all of the addresses (may be set it to null) of all students and return them in a list
		
		for(Student x: studentList){
			x.setMailingAddress(null); 
			x.setPermanentAddress(null);
			System.out.println(x);
		}
	}

}
