/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classgradingsystem;

import java.util.*;

/**
 *
 * @author user
 */
public abstract class Teacher extends User {
    private int teacher_id;
    private String department_name;
    private List<Class> classList;
    
    public Teacher(int user_id, String username, String password, String firstname, String lastname) {
        super(user_id, username, password, firstname, lastname);
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public List<Class> getClassList() {
        return classList;
    }

    public void setClassList(List<Class> classList) {
        this.classList = classList;
    }
    
//    public Class getClass(int class_id){
//        
//    }
//    
//    public boolean addClass(Class newClass){
//    
//    }
//    
//    public boolean removeClass(int class_id){
//        
//    }
//    
//    public boolean updateClass(Class newClass){
//    
//    }
        @Override
    public void displayName (String firstname, String lastname){
        System.out.println("First Name: "+firstname);
        System.out.println("Last Name: "+lastname);
    }
     
//    @Override
//    public String toString(){
////        return "Username:" + username + "First Name:";
//    } 
}
