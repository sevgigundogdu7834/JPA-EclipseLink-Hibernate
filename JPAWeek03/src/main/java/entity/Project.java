package entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    private String project_name;

    @ManyToMany(mappedBy = "projectList")
    private List<Employee3> employee3List;

    public Project() {
    }

    public List<Employee3> getEmployee3List() {
        return employee3List;
    }

    public void setEmployee3List(List<Employee3> employee3List) {
        this.employee3List = employee3List;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }
}
