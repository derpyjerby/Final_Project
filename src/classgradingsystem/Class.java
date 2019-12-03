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
public class Class {
    private int class_id;
    private int subject_id;
    private int teacher_id;
    private String schedule;
    private boolean isClassEnded;
    private List <ClassRecord> classRecordList;

    public int getClassId() {
        return class_id;
    }

    public void setClassId(int class_id) {
        this.class_id = class_id;
    }

    public int getSubjectId() {
        return subject_id;
    }

    public void setSubjectId(int subject_id) {
        this.subject_id = subject_id;
    }

    public int getTeacherId() {
        return teacher_id;
    }

    public void setTeacherId(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public boolean getIsClassEnded() {
        return isClassEnded;
    }

    public void setIsClassEnded(boolean isClassEnded) {
        this.isClassEnded = isClassEnded;
    }

    public List<ClassRecord> getClassRecordList() {
        return classRecordList;
    }

    public void setClassRecordList(List<ClassRecord> classRecordList) {
        this.classRecordList = classRecordList;
    }
    
//    public ClassRecord getClassRecord(int student_id){
//        
//    }
//    
//    public boolean addClassRecord (ClassRecord classRecord){
//        
//    }
//    
//    public boolean removeClassRecord (int student_id){
//        
//    }
//    
//    public boolean updateClassRecord (ClassRecord classRecord){
//        
//    }
//    
//    public String toString(){
//        
//    }
}
