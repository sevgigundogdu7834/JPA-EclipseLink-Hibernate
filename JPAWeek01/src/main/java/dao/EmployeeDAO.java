package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

import domain.Employee;
public class EmployeeDAO {

    private EntityManager entityManager;

    public EmployeeDAO(EntityManager entityManager) {
        super();
        this.entityManager = entityManager;
    }

    public void saveEmployee(Employee employee){
        // programatic transaction
        // insert ve update işlemleri transaction arasında olmalıdır.

        EntityTransaction  entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(employee);
        entityTransaction.commit();
    }

    public Employee findEmployeebyId(int id){

        return entityManager.find(Employee.class,id);
    }

    public void removeEmployee(int id){
        // Remove işlemi transaction arasında olmalıdır.

        EntityTransaction  entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.remove(findEmployeebyId(id));

        entityTransaction.commit();
    }

    public List<Employee> findAllEmployee(){

        Query query=entityManager.createQuery("Select e from Employee e");
        return  query.getResultList();
    }

    public Employee raise_salary(int id,int raise){

        // Güncelleme işlemi yapılırken transaction arasına alınmalıdır işlemelr.

        EntityTransaction  entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();

        Employee employee=findEmployeebyId(id);
        if(employee!=null){

            employee.setSalary(employee.getSalary()+raise);

        }

        entityTransaction.commit();

        return employee;

    }
}
