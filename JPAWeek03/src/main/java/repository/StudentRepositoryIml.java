package repository;

import embeded.Employee4;
import entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class StudentRepositoryIml implements StudentRepository {

   private EntityManager entityManager;

    public StudentRepositoryIml(EntityManager entityManager) {
        super();
        this.entityManager = entityManager;
    }

    public void saveEmployee(Employee employee) {

        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(employee);
        entityTransaction.commit();
    }

    public void saveEmployee2(Employee2 employee2) {
        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(employee2);
        entityTransaction.commit();
    }

    public void saveEmployee3(Employee3 employee3) {
        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(employee3);
        entityTransaction.commit();
    }

    public void saveEmployee3(Employee4 employee4) {

        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(employee4);
        entityTransaction.commit();
    }


    public void saveStudent(Student student) {

        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(student);
        entityTransaction.commit();

    }

    public void insertDeparment(Department department) {

        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(department);
        entityTransaction.commit();
    }

    public void insertParkingSpace(ParkingSpace parkingSpace) {

        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(parkingSpace);
        entityTransaction.commit();
    }

    public void insertPhone(Phone phone) {

        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(phone);
        entityTransaction.commit();
    }

    public void insertProject(Project project) {
        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(project);
        entityTransaction.commit();
    }


}
