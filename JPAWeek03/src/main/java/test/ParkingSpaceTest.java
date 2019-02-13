package test;

import entity.Department;
import entity.ParkingSpace;
import entity.Student;
import entity.StudentTypeEnum;
import repository.StudentRepositoryIml;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class ParkingSpaceTest {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("StudentPersistenceUnitForHibernate");
        EntityManager em=entityManagerFactory.createEntityManager();

        StudentRepositoryIml studentRepositoryIml=new StudentRepositoryIml(em);

        Date today=new Date();
        byte[] picture = { 1, 5, 6, 7, 2, 5, 10, 22, 40, 50 };

        Department department=new Department();
        department.setDepartmentName("COMPUTER ENGİNEERİNG ");

        ParkingSpace parkingSpace=new ParkingSpace();
        parkingSpace.setFlat(345);
        parkingSpace.setLocation("İzmir");

        Student student=new Student();
        student.setName("Hazal");
        student.setSurname("Kaya");
        student.setSchool_number(23);
        student.setStart_Date(today);
        student.setStudentType(StudentTypeEnum.ÜNİVERSİTE);
        student.setImage(picture);
        student.setParkingSpace(parkingSpace);



        parkingSpace.setStudent(student);

        studentRepositoryIml.insertParkingSpace(parkingSpace);
        studentRepositoryIml.saveStudent(student);

        ParkingSpace find=em.find(ParkingSpace.class,1);
        System.out.println(find);
    }
}
