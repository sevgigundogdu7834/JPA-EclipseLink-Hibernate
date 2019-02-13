package entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee3 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    private String name;
    private String surname;

    @ManyToMany
    @JoinTable(name = "Emp_Prj",
    joinColumns = @JoinColumn(name = "emp_id"),
    inverseJoinColumns = @JoinColumn(name = "prj_id"))
    private List<Project> projectList;

    public Employee3() {
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
