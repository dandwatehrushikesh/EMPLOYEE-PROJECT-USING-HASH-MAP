package Entity;

public class EmployeeEntity{
	
 private String name;
 private String department;
 private int age;
 private int salary;
public EmployeeEntity(String name, String department, int age, int salary) {
	super();
	this.name = name;
	this.department = department;
	this.age = age;
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "MovieEntity [name=" + name + ", department=" + department + ", age=" + age + ", salary=" + salary + "]";
}

 

}