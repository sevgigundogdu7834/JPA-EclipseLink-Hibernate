package embeded;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee4 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    private String name;
    private String surname;

    @CollectionTable(name = "EMP_EMAİL",joinColumns = @JoinColumn(name = "EMP_İD"))
    @Column(name = "EMAİL_ADRESS")
    @ElementCollection
    private List<String> email;

    public Employee4() {
    }

    @Embedded
    private Adress adress;

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
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
