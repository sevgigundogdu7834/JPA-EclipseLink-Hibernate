package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    private String tel_no;




    public String getTel_no() {
        return tel_no;
    }

    public void setTel_no(String tel_no) {
        this.tel_no = tel_no;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "ID=" + ID +
                ", tel_no='" + tel_no + '\'' +
                '}';
    }
}
