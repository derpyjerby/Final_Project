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
public class Student extends User{
    private int student_id;
    private float general_average;
    private List<ClassRecord> classRecordList;
    
    public Student(int user_id, String username, String password, String firstname, String lastname) {
        super(user_id, username, password, firstname, lastname);
    }
    
    public Student(int user_id, String username, String password, String firstname, String lastname, int student_id) {
        super(user_id, username, password, firstname, lastname);
        this.student_id = student_id;
        this.general_average = 0;
        this.classRecordList = new ArrayList<>();
    }
    
    public Student(int user_id, String username, String password, String firstname, String lastname, int student_id, float general_average, List<ClassRecord> classRecordList) {
        super(user_id, username, password, firstname, lastname);
        this.student_id = student_id;
        this.general_average = general_average;
        this.classRecordList = classRecordList;
    }
    
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
    
    public ClassRecord getClassRecord(int class_id, int student_id){
        ClassRecord ret = null;
        
        if (0 <= classRecordList.size()) {
            for (ClassRecord c : classRecordList) {
                if (c.getClassId() == class_id && c.getStudentId() == student_id) {
                    ret = c;
                    break;
                }
            }
        }
        
        return ret;
    } 
    
    public boolean addClassRecord(ClassRecord classRecord){
        return this.classRecordList.add(classRecord);
    }
    
    public boolean removeClassRecord(int class_id, int student_id){
        if (0 < this.classRecordList.size()) {
            try {
                this.classRecordList.remove(this.classRecordList.indexOf(getClassRecord(class_id, student_id)));
                return true;
            } catch (IndexOutOfBoundsException ex){
                return false;
            }
        } else {
            return false;
        }
    }
    
    public boolean updateClassRecord(ClassRecord classRecord){
        if (0 < this.classRecordList.size()) {
            int ndx = this.classRecordList.indexOf(getClassRecord(classRecord.getClassId(), classRecord.getStudentId()));
            
            if (-1 == ndx) {
                return false;
            } else {
                this.classRecordList.set(ndx, classRecord);
                return true;
            }
        } else {
            return false;
        }
    }
    
    @Override
    public String getName() {
        return "Student Name: " + this.getFirstname() + " " + this.getLastname();
    }
     
    @Override
    public String toString() {
        return "User type: Student";
    }

}
