package com.basic;

public class CreateStudent {
	public void printStudent(StudentDetails student) {
		System.out.println(student);
	}
	public static void main(String args[]) {
		StudentDetails student = new StudentDetails();
		student.setFirstName("yoga");
		student.setLastName("priya");
		student.setGender("female");
		student.setBranch("EEE");
		CreateStudent printStudent = new CreateStudent();
		printStudent.printStudent(student);
}
}
