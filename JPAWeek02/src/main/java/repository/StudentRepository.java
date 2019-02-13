package repository;


import entity.Department;
import entity.ParkingSpace;
import entity.Student;

public interface StudentRepository {

    public void saveStudent(Student student);

    public void insertDeparment(Department department);

    public void insertParkingSpace(ParkingSpace parkingSpace);
}
