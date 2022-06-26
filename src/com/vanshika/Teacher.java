package com.vanshika;

/**
 * This class is responsible for keeping track of
 * teacher's id, name and salary
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * This creates a new teacher object
     * @param id id for teacher
     * @param name name of teacher
     * @param salary salary of teacher
     */
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned = 0;
    }

    /**
     *
     * @return teacher id.
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return teacher name
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return teacher salary
     */
    public int getSalary(){
        return salary;
    }

    /**
     * Set teachers salary.
     * @param salary
     */

    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     * Adds to salary
     * Removes from the total money earned by the school
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }
}

