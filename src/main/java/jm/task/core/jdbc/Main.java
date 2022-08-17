package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoHibernateImpl userService = new UserDaoHibernateImpl();
        userService.createUsersTable();
        userService.saveUser("sfsf", "fdbd", (byte) 11);
        userService.saveUser("fgjdf", "ewrtr", (byte) 12);
        userService.saveUser("wqetb", "wegv", (byte) 13);
        userService.saveUser("gdsf", "gfsdfbv", (byte) 24);
        userService.removeUserById(4);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
