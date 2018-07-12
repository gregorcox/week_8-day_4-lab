package models;

public class Administrator extends Employee {

    private Manager manager;

    public Administrator(){}

    public Administrator(String name, int niNumber, double salary, Manager manager) {
        super(name, niNumber, salary);
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
