package jpa;

import org.hibernate.Session;

public class TestForeignKeyAssociation {
	 
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
 
        AccountEntity account = new AccountEntity();
        account.setAccount_number("1234567890");
 
        // Add new Employee object
        EmployeeEntity emp = new EmployeeEntity();
        emp.setEmail("abc-def@mail.com");
        emp.setFirst_name("abc");
        emp.setLast_name("def");
 
        // Save Account
        session.saveOrUpdate(account);
        // Save Employee
        emp.setAccount(account);
        session.saveOrUpdate(emp);
 
        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}