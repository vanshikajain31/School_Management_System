package com.vanshika;

/*
This class is responsible for keeping track for student id,
name, grade, feesTotal and feesPaid
 */

public class Student{
    private int id;
    private String name;
    private int grade;
    private int feesTotal;
    private int feesPaid;

    /**
     * to create a new student by initializing
     * fees for every student is 30,000$ / year
     * fees paid is initially 0.
     * @param id id for the student
     * @param name name of student
     * @param grade grade of student
     */

    public Student(int id, String name, int grade){
        feesPaid = 0;
        feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /**
     *
     * @return id for student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return class of student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return total fees of student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return fees paid by student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    //not going to change student's name and id

    /**
     * Used to update student's grade
     * @param grade new grade of the student
     */

    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * keeps adding fees to feesPaid
     * @param fees the fees that student pays.
     */
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return remaining fees
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }
}
