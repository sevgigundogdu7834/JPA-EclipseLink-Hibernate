package test;

import entity.Department;
import entity.ParkingSpace;
import entity.Student;
import entity.StudentTypeEnum;
import repository.StudentRepository;
import repository.StudentRepositoryIml;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class StudentTest {

    public static void main(String[] args) {

        EntityManagerFactory emf=Persistence.createEntityManagerFactory("StudentPersistenceUnitForHibernate");
        EntityManager entityManager=emf.createEntityManager();

        StudentRepository studentRepository=new StudentRepositoryIml(entityManager);

        Date today=new Date();
        byte[] picture = { 1, 5, 6, 7, 2, 5, 10, 22, 40, 50 };

        Department department=new Department();
        department.setDepartmentName("IT SCİENCE");



        Department department1=new Department();
        department1.setDepartmentName("COMPUTER ENGİNEERİNG ");

        ParkingSpace parkingSpace=new ParkingSpace();
        parkingSpace.setFlat(23);
        parkingSpace.setLocation("Bayrampaşa");

        Student student=new Student();
        student.setName("Hazal");
        student.setSurname("Kaya");
        student.setSchool_number(23);
        student.setStart_Date(today);
        student.setStudentType(StudentTypeEnum.ÜNİVERSİTE);
        student.setImage(picture);

        student.setParkingSpace(parkingSpace);

        Student student1=new Student();
        student1.setName("Ahmet");
        student1.setSurname("Kaya");
        student1.setSchool_number(26);
        student1.setStart_Date(today);
        student1.setStudentType(StudentTypeEnum.LİSE);
        student1.setImage(picture);
        student1.setParkingSpace(parkingSpace);



        studentRepository.insertDeparment(department);
        studentRepository.insertDeparment(department1);

        studentRepository.insertParkingSpace(parkingSpace);

        studentRepository.saveStudent(student);
        studentRepository.saveStudent(student1);

    }
}
