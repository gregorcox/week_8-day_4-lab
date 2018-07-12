package models;

import java.util.List;

public class Manager extends Employee {

    private double budget;
    private Department department;
    private List<Administrator> administrators;

    public Manager(String name, int niNumber, double salary, double budget){
        super(name, niNumber, salary);
        this.budget = budget;
        this.department = department;
        this.administrators = administrators;
    }

    public double getBudget() {
        return budget;
    }

    public Department getDepartment() {
        return department;
    }

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
