/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classgradingsystem;

/**
 *
 * @author brand
 */
public class Employee extends User {

    private String employeeType;
    
    public Employee(int user_id, String username, String password, String firstname, String lastname) {
        super(user_id, username, password, firstname, password);
    }
    
    public Employee(int user_id, String username, String password, String firstname, String lastname, String employeeType) {
        super(user_id, username, password, firstname, password);
        this.employeeType = employeeType;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
    
    @Override
    public String getName() {
        return "Employee Name: " + this.getFirstname() + " " + this.getLastname();
    }

    @Override
    public String toString() {
        return "User type: Employee";
    }
    
}
