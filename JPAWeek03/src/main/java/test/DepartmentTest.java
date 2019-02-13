package test;

import entity.Department;
import entity.Employee;
import repository.StudentRepositoryIml;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DepartmentTest {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
        EntityManager em=entityManagerFactory.createEntityManager();

        StudentRepositoryIml studentRepositoryIml=new StudentRepositoryIml(em);

        Employee employee=new Employee();
        employee.setName("Ayşegül");
        employee.setSurname("Gündoğdu");

        Employee employee1=new Employee();
        employee1.setName("Aynur");
        employee1.setSurname("Öztürk");

        studentRepositoryIml.saveEmployee(employee);
        studentRepositoryIml.saveEmployee(employee1);

        Department department=new Department();
        department.setDepartmentName("IT ...");
        studentRepositoryIml.insertDeparment(department);

        Department department1=new Department();
        department1.setDepartmentName("IT ...2222");
        studentRepositoryIml.insertDeparment(department1);

        EntityTransaction entityTransaction=em.getTransaction();
        entityTransaction.begin();
      employee.setDepartment(department);
        employee1.setDepartment(department1);

        // Hibernate de Exception in thread "main" java.lang.NullPointerException hatası alırız.
        department.getEmployee().add(employee);
        department.getEmployee().add(employee1);
        entityTransaction.commit();

        Department foundDept= em.find(Department.class,3);
        System.out.println(foundDept);











    }


}
