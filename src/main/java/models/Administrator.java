package models;

import javax.persistence.*;

@Entity
@Table(name = "administrators")
public class Administrator extends Employee {

    private int id;
    private Manager manager;

    public Administrator(){}

    public Administrator(String name, int niNumber, double salary, Manager manager) {
        super(name, niNumber, salary);
        this.manager = manager;
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

    @ManyToOne
    @JoinColumn(name = "manager_id", nullable = false)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
