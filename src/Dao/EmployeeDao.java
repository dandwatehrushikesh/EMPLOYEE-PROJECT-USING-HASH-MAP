package Dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Entity.EmployeeEntity;

public class EmployeeDao {

	public Map<String, List<EmployeeEntity>> giveDetails() {

		Map<String, List<EmployeeEntity>> Employeedb = new HashMap<String, List<EmployeeEntity>>();

		List<EmployeeEntity> Electrical = new ArrayList<EmployeeEntity>();

		Electrical.add(new EmployeeEntity(" Hrushi", " electricl", 24, 40000));
		Electrical.add(new EmployeeEntity(" Sainath", " electricl", 22, 50000));
		Electrical.add(new EmployeeEntity(" prasad", " electricl", 25, 45000));
		Electrical.add(new EmployeeEntity(" kiran", " electricl", 27, 55000));
		Electrical.add(new EmployeeEntity(" nikhil", " electricl", 23, 65000));

		Employeedb.put("Electrical", Electrical);

		List<EmployeeEntity> Robotics = new ArrayList<EmployeeEntity>();

		Robotics.add(new EmployeeEntity(" sandip", " robotics", 38, 85000));
		Robotics.add(new EmployeeEntity(" sachin", " robotics", 40, 68000));
		Robotics.add(new EmployeeEntity(" pradip", " rorotics", 32, 46000));
		Robotics.add(new EmployeeEntity(" rohan", " robotics", 44, 80000));
		Robotics.add(new EmployeeEntity(" ravindra", " robotics", 42, 40000));

		Employeedb.put("Robotics", Robotics);

		List<EmployeeEntity> Computer = new ArrayList<EmployeeEntity>();

		Computer.add(new EmployeeEntity(" pratik", " computer", 27, 100000));
		Computer.add(new EmployeeEntity(" kiran", " computer", 29, 50000));
		Computer.add(new EmployeeEntity(" darshan", " computer", 28, 55000));
		Computer.add(new EmployeeEntity(" kiran", " computer", 25, 85000));
		Computer.add(new EmployeeEntity(" sandip", " computer", 30, 75000));

		Employeedb.put("Computer", Computer);

		List<EmployeeEntity> Civil = new ArrayList<EmployeeEntity>();

		Civil.add(new EmployeeEntity(" amol", " civil", 32, 80000));
		Civil.add(new EmployeeEntity(" kiran", " civil", 35, 58000));
		Civil.add(new EmployeeEntity(" sarthak", " civil", 28, 56000));
		Civil.add(new EmployeeEntity(" tejas", " civil", 27, 85000));
		Civil.add(new EmployeeEntity(" rohan", " civil", 30, 45000));

		Employeedb.put("Civil", Civil);
		return Employeedb;

	}
}