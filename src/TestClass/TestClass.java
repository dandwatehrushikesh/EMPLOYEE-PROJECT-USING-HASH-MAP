package TestClass;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import Controller.EmployeeController;
import Entity.EmployeeEntity;

public class TestClass {

	public static void main(String[] args) {

		EmployeeController e1 = new EmployeeController();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println(" ELECTRICAL CIVIL COMPUTER ROBOTICS");
			System.out.println("1  Show Employee");
			System.out.println("2 Show Employee By Ascending Order");
			System.out.println("3 Show Employee By Descinding Order");
			System.out.println("4 Show Employee By Same Salary");
			System.out.println("5 Show Employee By Same Age");
			System.out.println("6 Show Employee By Same Name");
			System.out.println("7 Insert Employee");
			
			System.out.println(" Enter your Choice : ");
			
			int choice = scanner.nextInt();
			
			switch(choice) {
			
			case 1:
				e1.ShowEmployee();
				break;
				
			case 2:
				e1.ShowEmployeeAscendingOrder();
				break;
				
			case 3:
				e1.ShowEmployeeDescindingOrder();
				break;
				
			case 4:
				e1.ShowEmployeeBySameSalary();
				break;
				
			case 5:
				e1.showEmployeeBySameAge();
				break;
				
			case 6:
				e1.showEmployeeBySameName();
				break;
				
			
		
				
			default :
				System.out.println(" Incorrect choice ");
			
				
			}
			
		}
		
		//e1.ShowEmployee();
		//System.out.println();
		
		//e1.ShowEmployeeAscendingOrder();
		//System.out.println();
		
		//e1.ShowEmployeeDescindingOrder();
		//System.out.println();
		
		//e1.ShowEmployeeBySameSalary();
		//System.out.println();
		
		
		//e1.showEmployeeBySameAge();
		//System.out.println();
		
		//e1.showEmployeeBySameName();
		//System.out.println();
		
	}
}