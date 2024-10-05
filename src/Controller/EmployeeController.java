package Controller;

import java.util.List;
import java.util.Map;

import Entity.EmployeeEntity;
import Service.EmployeeService;

public class EmployeeController {

	EmployeeService service;

	public Map<String, List<EmployeeEntity>> ShowEmployee() {
		service = new EmployeeService();

		Map<String, List<EmployeeEntity>> db1 = service.ShowEmployee();

		return db1;

	}

	public Map<String, List<EmployeeEntity>> ShowEmployeeAscendingOrder() {
		service = new EmployeeService();

		Map<String, List<EmployeeEntity>> db1 = service.ShowEmployeeAscendingOrder();
		return db1;

	}

	public Map<String, List<EmployeeEntity>> ShowEmployeeDescindingOrder() {
		service = new EmployeeService();

		Map<String, List<EmployeeEntity>> db1 = service.ShowEmployeeDescindingOrder();
		return db1;

	}

	public Map<String, List<EmployeeEntity>> ShowEmployeeBySameSalary() {
		service = new EmployeeService();

		Map<String, List<EmployeeEntity>> db1 = service.ShowEmployeeBySameSalary();
		return db1;

	}

	public Map<String, List<EmployeeEntity>> showEmployeeBySameAge() {
		service = new EmployeeService();

		Map<String, List<EmployeeEntity>> db1 = service.ShowEmployeeBySameSalary();
		return db1;

	}
	public Map<String, List<EmployeeEntity>> showEmployeeBySameName() {
		service = new EmployeeService();

		Map<String, List<EmployeeEntity>> db1 = service.showEmployeeBySameName();
		return db1;
		
		
	}
	
		
	}

