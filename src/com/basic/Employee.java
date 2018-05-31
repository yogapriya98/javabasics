package com.basic;

public class Employee {
		String FirstName;
		String LastName;
		double Salary;
		public Employee() {
			
		}
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String firstName) {
			FirstName = firstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public double getSalary() {
			if(Salary >0) {
			return Salary;
			}
			return 0;
		}
		public void setSalary(double salary) {
			Salary = salary;
		}
		
		public static void main(String s[]) {
			Employee first =new Employee();
			first.setFirstName("Yoga");
			first.setSalary(100000);
			System.out.println("first employee annual salary ="+first.Salary*12);
			double currentSalary = first.getSalary();
			currentSalary = currentSalary*1.1;
			System.out.println("last employee salary aftet increment ="+first.Salary);
			Employee last = new Employee();
			last.setLastName("vedha");
			last.setSalary(120000);
			System.out.println("first employee annual salary ="+last.Salary*12);
			currentSalary = last.getSalary();
			currentSalary = currentSalary*1.1;
			//second.setSalary = 120000;
			System.out.println("last employee salary after increment ="+last.Salary);
		}
}
		
