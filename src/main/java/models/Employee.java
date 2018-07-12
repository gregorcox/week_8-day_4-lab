package models;


import javax.persistence.*;

@Entity
@Table(name = "employees")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")
public abstract class Employee {

    private int id;
    private String name;
    private int niNumber;
    private double salary;

    public Employee(){}

    public Employee(String name, int niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "name")
    public String getName() {
        return name;
    }

    @Column(name = "ni_number")
    public int getNiNumber() {
        return niNumber;
    }

    @Column(name = "salary")
    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNiNumber(int niNumber) {
        this.niNumber = niNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
