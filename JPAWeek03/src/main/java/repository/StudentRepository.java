package repository;


import entity.*;
import embeded.Employee4;

public interface StudentRepository {

    public void saveEmployee(Employee employee);

    public void saveEmployee2(Employee2 employee);

    public void saveEmployee3(Employee3 employee3);

    public void saveEmployee3(Employee4 employee4);

    public void saveStudent(Student student);


    public void insertDeparment(Department department);

    public void insertParkingSpace(ParkingSpace parkingSpace);

    public void insertPhone(Phone phone);

    public void insertProject(Project project);



}
