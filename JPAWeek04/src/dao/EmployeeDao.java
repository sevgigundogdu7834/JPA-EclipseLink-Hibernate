package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDao {
	
	public void saveEmployee(Employee employee);
	public Employee findEmployee(int id);

	public List<Employee> findAllEmployees();

	public void removeEmployee(int id);

}
