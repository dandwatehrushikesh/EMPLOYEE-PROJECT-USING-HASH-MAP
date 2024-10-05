package Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Dao.EmployeeDao;
import Entity.EmployeeEntity;

public class EmployeeService {

	EmployeeDao dao;

	public Map<String, List<EmployeeEntity>> ShowEmployee() {

		dao = new EmployeeDao();
		Map<String, List<EmployeeEntity>> Employeedb = dao.giveDetails();

		Employeedb.forEach((department, employees) -> {
			System.out.println("Department: " + department);
			employees.forEach(employee -> System.out.println(employee.toString()));
		});

		return Employeedb;

	}

	public Map<String, List<EmployeeEntity>> ShowEmployeeAscendingOrder() {

		dao = new EmployeeDao();
		Map<String, List<EmployeeEntity>> Employeedb = dao.giveDetails();

		System.out.println("Employees in ascending order of their salaries:");
		for (List<EmployeeEntity> employees : Employeedb.values()) {
			employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
			for (EmployeeEntity employee : employees) {
				System.out.println("Department: " + employee.getDepartment());
				System.out.println(employee.toString());
			}
		}

		return Employeedb;
	}

	public Map<String, List<EmployeeEntity>> ShowEmployeeDescindingOrder() {

		dao = new EmployeeDao();
		Map<String, List<EmployeeEntity>> Employeedb = dao.giveDetails();
		System.out.println("Employees in descending order of their salaries:");
		for (List<EmployeeEntity> employees : Employeedb.values()) {
			employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
			for (EmployeeEntity employee : employees) {
				System.out.println("Department: " + employee.getDepartment());
				System.out.println(employee.toString());
			}
		}

		return Employeedb;
	}
	public Map<String, List<EmployeeEntity>> ShowEmployeeBySameSalary() {
		dao = new EmployeeDao();
		Map<String, List<EmployeeEntity>> Employeedb = dao.giveDetails();
		 // Group employees by salary
	    Map<Double, List<EmployeeEntity>> employeesBySalary = new HashMap<>();
	    for (List<EmployeeEntity> employees : Employeedb.values()) {
	        for (EmployeeEntity employee : employees) {
	            employeesBySalary.computeIfAbsent((double) employee.getSalary(), k -> new ArrayList<>()).add(employee);
	        }
	    }
	    
	    // Display employees with the same salary
	    System.out.println("Employees with the same salary:");
	    employeesBySalary.forEach((salary, employees) -> {
	        if (employees.size() > 1) {
	            System.out.println("Salary: " + salary);
	            for (EmployeeEntity employee : employees) {
	                System.out.println("Department: " + employee.getDepartment());
	                System.out.println(employee.toString());
	            }
	        }
	    });
	    
	    return Employeedb;
	}
	public Map<String, List<EmployeeEntity>> showEmployeeBySameAge() {
	    
	    dao = new EmployeeDao();
	    Map<String, List<EmployeeEntity>> employeeDb = dao.giveDetails();
	    
	    // Group employees by age
	    Map<Integer, List<EmployeeEntity>> employeesByAge = new HashMap<>();
	    for (List<EmployeeEntity> employees : employeeDb.values()) {
	        for (EmployeeEntity employee : employees) {
	            employeesByAge.computeIfAbsent(employee.getAge(), k -> new ArrayList<>()).add(employee);
	        }
	    }
	    
	    // Display employees with the same age
	    System.out.println("Employees with the same age:");
	    employeesByAge.forEach((age, employees) -> {
	        if (employees.size() > 1) {
	            System.out.println("Age: " + age);
	            for (EmployeeEntity employee : employees) {
	                System.out.println("Department: " + employee.getDepartment());
	                System.out.println(employee.toString());
	            }
	        }
	    });
	    
	    return employeeDb;
	}
	
	
	public Map<String, List<EmployeeEntity>> showEmployeeBySameName() {
	    
	    dao = new EmployeeDao();
	    Map<String, List<EmployeeEntity>> employeeDb = dao.giveDetails();
	    
	    // Group employees by name
	    Map<String, List<EmployeeEntity>> employeesByName = new HashMap<>();
	    for (List<EmployeeEntity> employees : employeeDb.values()) {
	        for (EmployeeEntity employee : employees) {
	            employeesByName.computeIfAbsent(employee.getName(), k -> new ArrayList<>()).add(employee);
	        }
	    }
	    
	    // Display employees with the same name
	    System.out.println("Employees with the same name:");
	    employeesByName.forEach((name, employees) -> {
	        if (employees.size() > 1) {
	            System.out.println("Name: " + name);
	            for (EmployeeEntity employee : employees) {
	                System.out.println("Department: " + employee.getDepartment());
	                System.out.println(employee.toString());
	            }
	        }
	    });
	    
	    return employeeDb;
	    
	    
	} 
	
	}


