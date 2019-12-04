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
public class Teacher extends Employee {
    
    private int teacher_id;
    private String department_name;
    private List<Class> classList;
    
    public Teacher(int user_id, String username, String password, String firstname, String lastname) {
        super(user_id, username, password, firstname, lastname);
    }

    public Teacher(int user_id, String username, String password, String firstname, String lastname, int teacher_id, String department_name, List<Class> classList) {
        super(user_id, username, password, firstname, lastname);
        this.teacher_id = teacher_id;
        this.department_name = department_name;
        this.classList = classList;
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

    public Class getClass(int class_id){
        Class ret = null;
        
        if (0 <= classList.size()) {
            for (Class c : classList) {
                if (c.getClassId() == class_id) {
                    ret = c;
                    break;
                }
            }
        }
        
        return ret;
    }
    
    public boolean addClass(Class newClass){
        return this.classList.add(newClass);
    }
    
    public boolean removeClass(int class_id){
        if (0 < this.classList.size()) {
            try {
                this.classList.remove(this.classList.indexOf(getClass(class_id)));
                return true;
            } catch (IndexOutOfBoundsException ex){
                return false;
            }
        } else {
            return false;
        }
    }
    
    public boolean updateClass(Class newClass){
        if (0 < this.classList.size()) {
            int ndx = this.classList.indexOf(getClass(newClass.getClassId()));
            
            if (-1 == ndx) {
                return false;
            } else {
                this.classList.set(ndx, newClass);
                return true;
            }
        } else {
            return false;
        }
    }
   
    @Override
    public String getName (){
        return this.department_name + " Teacher Name: " + this.getFirstname() + " " + this.getLastname();
    }
     
    @Override
    public String toString(){
        return "User type: Teacher";
    } 
}
