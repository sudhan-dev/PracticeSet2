
// to calculate salary of Employee ( only salary ) and Manager (salary + bonus ) using polymorphism

import java.util.Scanner;

public class PracticeProg2 {

	public static void main(String[] args) {
		int empSalary;
		int managerSalary, bonus;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary of employe:");
		empSalary = sc.nextInt();
		System.out.println("Enter salary of manager:");
		managerSalary = sc.nextInt();
		System.out.println("Enter bonus of manager:");
		bonus = sc.nextInt();
		Salary(empSalary);
		Salary(managerSalary, bonus);
		sc.close();
	}

	public static void Salary(int a) {
		System.out.println("Salary of employee is:" + " " + a);
	}

	public static void Salary(int a, int b) {
		System.out.println("Salary of manager is:" + " " + (a + b));
	}
}
