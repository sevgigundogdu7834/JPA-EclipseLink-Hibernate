package test;

import entity.Employee;
import entity.Employee3;
import entity.Project;
import repository.StudentRepositoryIml;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProjectTest {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
        EntityManager em=entityManagerFactory.createEntityManager();

        StudentRepositoryIml studentRepositoryIml=new StudentRepositoryIml(em);

        Employee3 employee=new Employee3();
        employee.setName("Ayşegül");
        employee.setSurname("Gündoğdu");

        Employee3 employee2=new Employee3();
        employee.setName("Sevgi");
        employee.setSurname("Gündoğdu");

        Employee3 employee3=new Employee3();
        employee.setName("Fatma");
        employee.setSurname("Gündoğdu");

        Project project=new Project();
        project.setProject_name("Çılgın Proje V1");

        Project project2=new Project();
        project.setProject_name("Çılgın Proje V2");

        Project project3=new Project();
        project.setProject_name("Çılgın Proje V3");

        studentRepositoryIml.saveEmployee3(employee);
        studentRepositoryIml.saveEmployee3(employee2);
        studentRepositoryIml.saveEmployee3(employee3);

        studentRepositoryIml.insertProject(project);
        studentRepositoryIml.insertProject(project2);
        studentRepositoryIml.insertProject(project3);

        em.getTransaction().begin();
        employee.getProjectList().add(project);
        employee.getProjectList().add(project2);

        employee2.getProjectList().add(project);
        employee2.getProjectList().add(project2);
        employee2.getProjectList().add(project3);

        employee3.getProjectList().add(project);
        em.getTransaction().commit();


    }
}
