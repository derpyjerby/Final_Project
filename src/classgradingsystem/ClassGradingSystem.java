/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classgradingsystem;

/**
 *
 * @author user
 */
public class ClassGradingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User user1 = new Employee(1, "user", "pass", "John", "Doe");
        User user2 = new Teacher(2, "root", "root", "Alpha", "Bravo", 1, "DCISM");
        User user3 = new Teacher(3, "asdf", "1234", "Charlie", "Delta", 2, "DASH");
        User user4 = new Student(4, "test", "test", "Juan", "Dela Cruz", 1);
        User user5 = new Student(5, "admin", "admin", "Bob", "Uy", 2);
        
        System.out.println(user1.getName());
        System.out.println(user1.toString());
        System.out.println(user2.getName());
        System.out.println(user2.toString());
        System.out.println(user3.getName());
        System.out.println(user3.toString());
        System.out.println(user4.getName());
        System.out.println(user4.toString());
        System.out.println(user5.getName());
        System.out.println(user5.toString());

        //System.out.println("Hello Avatar Brandon!");
        //new Login();
    }
    
}
