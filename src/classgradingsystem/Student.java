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
public abstract class Student extends User{
    private int student_id;
    private float general_average;
    private List<ClassRecord> classRecordList;
    
    public List<ClassRecord> getClassRecordList() {
        return classRecordList;
    }

    public void setClassRecordList(List<ClassRecord> classRecordList) {
        this.classRecordList = classRecordList;
    }
    
    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    public float getGeneralAverage() {
        return general_average;
    }

    public void setGeneralAverage(float general_average) {
        this.general_average = general_average;
    }
    
//    public ClassRecord getClassRecord(int class_id){
//        
//    } 
    
//    public boolean addClassRecord(ClassRecord classRecord){
//        
//    }
//    
//    public boolean removeClassRecord(int class_id){
//        
//    }
//    
//    public boolean updateClassRecord(ClassRecord classRecord){
//        
//    }
//    
    public Student(int user_id, String username, String password, String firstname, String lastname) {
        super(user_id, username, password, firstname, lastname);
    }
    
    @Override
    public String getName() {
        return "Student Name: " + this.getFirstname() + " " + this.getLastname();
    }
     
//    @Override
//    public String toString(){
////        return "Username:" + username + "First Name:";
//    } 

}
