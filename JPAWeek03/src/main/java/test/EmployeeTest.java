package test;

import entity.Department;
import entity.Employee;
import repository.StudentRepositoryIml;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeTest {

    public static void main(String[] args) {

        EntityManagerFactory emf=Persistence.createEntityManagerFactory("StudentPersistenceUnitForHibernate");
        EntityManager em=emf.createEntityManager();

        StudentRepositoryIml studentRepositoryIml=new StudentRepositoryIml(em);

        Department department=new Department();
        department.setDepartmentName("IT- sCİENCE");


        Employee employee=new Employee();
        employee.setName("Sevgi");
        employee.setSurname("Gündoğdu");
       /* employee.setDepartment(department);*/

        studentRepositoryIml.insertDeparment(department);
        studentRepositoryIml.saveEmployee(employee);

    }
}
