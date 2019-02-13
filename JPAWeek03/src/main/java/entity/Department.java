package entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Department {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    private String departmentName;

    // OneToMany
    // ManyToMany
    // Collections valued relationship

    @OneToMany(mappedBy = "department")
    private List<Employee> employee;



    public Department(){

    }

    @Override
    public String toString() {
        return "Department{" +
                "ID=" + ID +
                ", departmentName='" + departmentName + '\'' +
                ", employee=" + employee +
                '}';
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
