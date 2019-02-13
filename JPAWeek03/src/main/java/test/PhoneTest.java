package test;

import entity.Department;
import entity.Employee;
import entity.Employee2;
import entity.Phone;
import repository.StudentRepositoryIml;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class PhoneTest {

    public static void main(String[] args) {


        EntityManagerFactory emf= Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
        EntityManager em=emf.createEntityManager();

        StudentRepositoryIml studentRepositoryIml=new StudentRepositoryIml(em);

        Employee2 employee=new Employee2();
        employee.setName("Adem");
        employee.setSurname("Demir");

        Phone phone=new Phone();
        phone.setTel_no("05565666");

        Phone phone2=new Phone();
        phone.setTel_no("05565666");

        Phone phone3=new Phone();
        phone.setTel_no("05565666");

        studentRepositoryIml.insertPhone(phone);
        studentRepositoryIml.insertPhone(phone2);
        studentRepositoryIml.insertPhone(phone3);

        employee.getPhoneList().add(phone);
        employee.getPhoneList().add(phone2);
        employee.getPhoneList().add(phone3);

        studentRepositoryIml.saveEmployee2(employee);

       Employee2 found= em.find(Employee2.class,4);
        System.out.println(found);
    }
}
