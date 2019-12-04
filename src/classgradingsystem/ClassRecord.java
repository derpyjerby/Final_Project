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
public class ClassRecord {
    private int class_id;
    private int student_id;
    private float activities_grade;
    private float quizzes_grade;
    private float attendance_grade;
    private float final_grade; 

    public ClassRecord (int class_id, int student_id) {
        this.class_id = class_id;
        this.student_id = student_id;
        this.activities_grade = 0;
        this.quizzes_grade = 0;
        this.attendance_grade = 0;
        this.final_grade = 0;
    }
    
    public ClassRecord (int class_id, int student_id, float activities_grade, float quizzes_grade, float attendance_grade, float final_grade) {
        this.class_id = class_id;
        this.student_id = student_id;
        this.activities_grade = activities_grade;
        this.quizzes_grade = quizzes_grade;
        this.attendance_grade = attendance_grade;
        this.final_grade = final_grade;
    }
    
    public int getClassId() {
        return class_id;
    }

    public void setClassId(int class_id) {
        this.class_id = class_id;
    }

    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    public float getActivitiesGrade() {
        return activities_grade;
    }

    public void setActivitiesGrade(float activities_grade) {
        this.activities_grade = activities_grade;
    }

    public float getQuizzesGrade() {
        return quizzes_grade;
    }

    public void setQuizzesGrade(float quizzes_grade) {
        this.quizzes_grade = quizzes_grade;
    }

    public float getAttendanceGrade() {
        return attendance_grade;
    }

    public void setAttendanceGrade(float attendance_grade) {
        this.attendance_grade = attendance_grade;
    }

    public float getFinalGrade() {
        return final_grade;
    }

    public void setFinalGrade(float final_grade) {
        this.final_grade = final_grade;
    }
    
    public void calculateFinalGrade(){
        this.final_grade = this.activities_grade + this.attendance_grade + this.quizzes_grade;
        this.final_grade /= 3;
    }
    
    @Override
    public String toString(){
        return "Final Grade of " + this.student_id + ": " + this.final_grade;
    }
}
