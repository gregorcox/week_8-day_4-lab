package db;

import models.Administrator;
import models.Manager;

public class DBAdministrator {


    public static void addAdminsToManager(Administrator administrator, Manager manager){
        manager.addAdmins(administrator);
        DBHelper.update(manager); // REMEMBER THIS WILL CASCADE UPDATE TO PROJECT
    }
}
