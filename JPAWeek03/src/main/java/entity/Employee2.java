package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    private String name;
    private String surname;

    @OneToMany
    @JoinTable(name = "Emp_Phn",
    joinColumns = @JoinColumn(name = "emp_id"),
    inverseJoinColumns = @JoinColumn(name = "phn_id"))
    private List<Phone> phoneList=new ArrayList<Phone>();

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
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

    @Override
    public String toString() {
        return "Employee2{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneList=" + phoneList +
                '}';
    }
}
