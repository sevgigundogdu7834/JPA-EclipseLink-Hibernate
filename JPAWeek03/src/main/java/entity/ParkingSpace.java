package entity;

import javax.persistence.*;

import entity.Student;

@Entity
public class ParkingSpace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    private int flat;
    private String location;
/*
    // Bir parkingSpace ye sadece 1 öğrenci sahip olabilir.
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="ps_student",unique = true)
    private Student student;
    // Bi directional bir ilişki söz konusu değildir.
    // Unidirectional bir ilişki vardır.*/


    // owning side -- Ev sahibi olan kısım
    // inverse side

    // Bidirectional One To One bir iliskide mappedBy inverse side'a eklenir.
    // Bunun anlami Employee16 Entity'si bu iliskinin sahibidir , owning side.
    // Foreign key bilgisi bu durumda Employee16 tablosunda yer almaktadir.
    // Boylelikle inverse side'ta (ParkingSpace2) foreign key bilgisi saklanmaz.

    @OneToOne(mappedBy = "parkingSpace",cascade = CascadeType.ALL)
    @JoinColumn(name = "ps_student")
    private Student student;

    public ParkingSpace(){


    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "ParkingSpace{" +
                "ID=" + ID +
                ", flat=" + flat +
                ", location='" + location + '\'' +
                ", student=" + student +
                '}';
    }
}
