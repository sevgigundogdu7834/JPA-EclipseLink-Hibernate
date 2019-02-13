package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Student_Table")
public class Student {

    @Id()

    // Annotation lari property/instance degisken ya da getter metotlar uzerine
    // koyabiliriz.
    // setter uzerine koymak anlam ifade etmez.

    // AUTO
    // TABLE
    // SEQUENCE
    // IDENTITY
    @GeneratedValue(strategy = GenerationType.AUTO)
    // MYSQL icin SEQUENCE adinda bir tablo olusur.
    // SEQ_NAME SEQ_COUNT kolonlari
    // ROW/RECORD -> SEQ_GEN default allocation 50

    // @GeneratedValue(strategy=GenerationType.TABLE)
    // SEQUENCE tablosu olusur.
    // ROW/RECORD -> SEQ_GEN_TABLE

//	@TableGenerator(name="EMP_GEN")
//	@GeneratedValue(generator="EMP_GEN")

//	@TableGenerator(name="EMP_GEN_DETAILED", table="KEY_GEN" , pkColumnName="ID_NAME" , valueColumnName="COUNT" , initialValue=1000)
//	@GeneratedValue(generator="EMP_GEN_DETAILED")

    // @GeneratedValue(strategy=GenerationType.SEQUENCE)
    // MYSQL de Sequence kavrami yerine AUTO_INCREMENT kavrami vardir.

    // @GeneratedValue(strategy=GenerationType.IDENTITY)
    // AUTO_INCREMENT
    //

//	@SequenceGenerator(name="SEQ_GEN" , sequenceName="ilgili veritabandaki sequence objesinin adi")
//	@GeneratedValue(generator="SEQ_GEN")


    @Column(name = "st_id")
    private int id;

    @Column(name = "st_name")
    private String name;

    @Column(name = "st_surname")
    private String surname;

    @Column(name = "st_number")
    private int school_number;

    @Column(name = "st_type")
    @Enumerated(EnumType.STRING)
    private StudentTypeEnum studentType;

    @Column(name="st_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date start_Date;

    @Column(name = "emp_image")
    @Lob
    private byte[] image;

    // Many->Student
    // One-> Department

    @ManyToOne
    @JoinColumn(name = "dept_id")
    public Department department;
    // Student tablosunda bu ilişki için bir column oluşur.
    // froeign key
    // varsayılan olarak isim proprtyName_idName


    @OneToOne
    @JoinColumn(name ="ps_id",unique = true)
    private ParkingSpace parkingSpace;

    public Student(){


    }

    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Date getStart_Date() {
        return start_Date;
    }

    public void setStart_Date(Date start_Date) {
        this.start_Date = start_Date;
    }

    public StudentTypeEnum getStudentType() {
        return studentType;
    }

    public void setStudentType(StudentTypeEnum studentType) {
        this.studentType = studentType;
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

    public int getSchool_number() {
        return school_number;
    }

    public void setSchool_number(int school_number) {
        this.school_number = school_number;
    }
}
