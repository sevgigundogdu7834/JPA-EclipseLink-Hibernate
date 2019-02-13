package embeded;

import repository.StudentRepositoryIml;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Arrays;

public class Employee4Test {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
        EntityManager em=entityManagerFactory.createEntityManager();

        StudentRepositoryIml studentRepositoryIml=new StudentRepositoryIml(em);

        Employee4 employee4=new Employee4();
        employee4.setName("Turgut");
        employee4.setSurname("Özal");
        employee4.setEmail(Arrays.asList("sevgigundogdu01@gmail.com","zuleyhakaya61@gmail.com"));


        Adress adress=new Adress();
        adress.setCity("İstanbul");
        adress.setNo("234");
        adress.setRoad("hdjhjd");
        adress.setStreet("üçyüzlü");
        adress.setZip("udjhjjd");

        employee4.setAdress(adress);

        studentRepositoryIml.saveEmployee3(employee4);

    }
}
