package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	public List<Employee> subordinates;
	public String name;
	public String surname;
	public double salary;

	public Employee(String name, String surname, double salary) {
		this.name = name;
		this.surname = surname;
		this.subordinates = new ArrayList<>();
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void add (Employee employee) {
		subordinates.add(employee);
	}
	
	public void remove (Employee employee) {
		subordinates.remove(employee);
	}
	
	@Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

	
}
