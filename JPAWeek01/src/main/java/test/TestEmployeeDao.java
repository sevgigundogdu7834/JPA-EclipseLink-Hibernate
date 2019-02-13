package test;

import dao.EmployeeDAO;
import domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestEmployeeDao {



    public static void main(String[] args) {

        EntityManagerFactory emf=Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
        EntityManager entityManager=emf.createEntityManager();

        EmployeeDAO employeeDAO=new EmployeeDAO(entityManager);

        Employee  employee=new Employee(1,"Sevgi","Gündoğdu",5000);
        Employee employee1=new Employee(2,"Züleyha","Kaya",100000 );

        System.out.println("İnserting.....");

        employeeDAO.saveEmployee(employee);
        employeeDAO.saveEmployee(employee1);

        System.out.println("İnserting okk.....");

        System.out.println("finding....");

         Employee findEmployee= employeeDAO.findEmployeebyId(2);
        System.out.println(findEmployee);

        System.out.println("finding okeyyy....");

        System.out.println("finding all Employee ...");

        employeeDAO.findAllEmployee().forEach(System.out::println);

        System.out.println("Employee removing...");

        employeeDAO.removeEmployee(2);

        System.out.println("Employee salary updating...");

        employeeDAO.raise_salary(1,300);
    }
}
