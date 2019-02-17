package service;

import java.util.List;

import dao.EmployeeDaoIml;
import model.Employee;

public class EmployeeServiceIml implements EmployeeServiceInt {

	EmployeeDaoIml employeeDaoIml=new EmployeeDaoIml();
	
	private void CheckSalary(Employee employee) {
		
		if(employee.getSalary()<100) {
			
			throw new RuntimeException("İnvalid salary");
		}
		
	}
	@Override
	public void saveEmployee(Employee employee) {
		
		CheckSalary(employee);
		employeeDaoIml.saveEmployee(employee);
		
		
	}

	@Override
	public Employee findEmployee(int id) {
		
		return employeeDaoIml.findEmployee(id);
	}

	@Override
	public List<Employee> findAllEmployees() {
	
		return employeeDaoIml.findAllEmployees();
	}

	@Override
	public void removeEmployee(int id) {
		
		employeeDaoIml.removeEmployee(id);
		
	}

}
