package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Employee;
import utility.EntityManagerUtility;

public class EmployeeDaoIml implements EmployeeDao{

	EntityManager entityManager = EntityManagerUtility.getEntityManager();
	@Override
	public void saveEmployee(Employee employee) {
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();

		
	}

	@Override
	public Employee findEmployee(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

	@Override
	public List<Employee> findAllEmployees() {
	
		Query query=entityManager.createQuery("Select e from Employee e");
		List<Employee> employeeList= query.getResultList();
		return employeeList;
		
	}

	@Override
	public void removeEmployee(int id) {
		
		entityManager.getTransaction().begin();
		Employee foundEmployee=findEmployee(id);
		
		if(foundEmployee!=null) {
			
			entityManager.remove(foundEmployee);
		}
		entityManager.getTransaction().commit();
		
	}

}
