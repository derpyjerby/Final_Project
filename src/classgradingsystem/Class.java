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

    public Class(int class_id, int subject_id, int teacher_id) {
        this.class_id = class_id;
        this.subject_id = subject_id;
        this.teacher_id = teacher_id;
        this.schedule = "0700-SaSu";
        this.isClassEnded = false;
    }
    
    public Class(int class_id, int subject_id, int teacher_id, String schedule, boolean isClassEnded, List<ClassRecord> classRecordList) {
        this.class_id = class_id;
        this.subject_id = subject_id;
        this.teacher_id = teacher_id;
        this.schedule = schedule;
        this.isClassEnded = isClassEnded;
        this.classRecordList = classRecordList;
    }

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
    
    public ClassRecord getClassRecord(int student_id, int class_id){
        ClassRecord ret = null;
        
        if (0 <= classRecordList.size()) {
            for (ClassRecord c : classRecordList) {
                if (c.getStudentId()== student_id && c.getClassId() == class_id) {
                    ret = c;
                    break;
                }
            }
        }
        
        return ret;
    }
    
    public boolean addClassRecord (ClassRecord classRecord){
        return this.classRecordList.add(classRecord);
    }
    
    public boolean removeClassRecord (int student_id, int class_id){
        if (0 < this.classRecordList.size()) {
            try {
                this.classRecordList.remove(this.classRecordList.indexOf(getClassRecord(student_id, class_id)));
                return true;
            } catch (IndexOutOfBoundsException ex){
                return false;
            }
        } else {
            return false;
        }
    }
    
    public boolean updateClassRecord (ClassRecord classRecord){
        if (0 < this.classRecordList.size()) {
            int ndx = this.classRecordList.indexOf(getClassRecord(classRecord.getStudentId(), classRecord.getClassId()));
            
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
    public String toString(){
        return "Schedule: " + this.schedule;
    }
}
