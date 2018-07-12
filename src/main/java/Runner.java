import db.DBHelper;
import models.Administrator;
import models.Department;
import models.Employee;
import models.Manager;

public class Runner {

    public static void main(String [] args) {

        Manager manager = new Manager("John", 123, 30000.10, 500000);
        DBHelper.save(manager);

        Department department = new Department("Sales", manager);
        DBHelper.save(department);

        Administrator administrator = new Administrator("Zsolt", 321, 24000, manager);
        DBHelper.save(administrator);

        manager.addAdmins(administrator);








    }

}
