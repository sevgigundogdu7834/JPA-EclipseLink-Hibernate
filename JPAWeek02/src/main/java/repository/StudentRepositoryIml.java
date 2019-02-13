package repository;

import entity.Department;
import entity.ParkingSpace;
import entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class StudentRepositoryIml implements StudentRepository {

   private EntityManager entityManager;

    public StudentRepositoryIml(EntityManager entityManager) {
        super();
        this.entityManager = entityManager;
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
}
