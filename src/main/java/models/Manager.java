package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "managers")
public class Manager extends Employee {

    private int id;
    private double budget;
    private Department department;
    private List<Administrator> administrators;

    public Manager(){}

    public Manager(String name, int niNumber, double salary, double budget){
        super(name, niNumber, salary);
        this.budget = budget;
        this.department = department;
        this.administrators = administrators;
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

    @Column(name = "budget")
    public double getBudget() {
        return budget;
    }


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    public Department getDepartment() {
        return department;
    }


    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
    public List<Administrator> getAdministrators() {
        return administrators;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setAdministrators(List<Administrator> administrators) {
        this.administrators = administrators;
    }
}
