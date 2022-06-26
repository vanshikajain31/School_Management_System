package com.vanshika;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher rita = new Teacher(1,"Rita", 500);
        Teacher gita = new Teacher(2, "Gita", 700);
        Teacher rahul = new Teacher(3, "Rahul", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(rita);
        teacherList.add(gita);
        teacherList.add(rahul);

        Student anshika = new Student(1, "Anshika", 4);
        Student pratha = new Student(2, "Pratha", 9);
        Student vanshika = new Student(3, "Vanshika", 12);

        List<Student> studentList = new ArrayList<>();
        studentList.add(anshika);
        studentList.add(pratha);
        studentList.add(vanshika);

        School dps = new School(teacherList, studentList);

        anshika.payFees(5000);
        vanshika.payFees(6000);
        System.out.println("DPS has earned $ "+dps.getTotalMoneyEarned());

        System.out.println("-----------Making School pay salary-----------");
        rita.receiveSalary(rita.getSalary());
        System.out.println("DPS has spent for salary to " +rita.getName() + " and now has $ " +dps.getTotalMoneyEarned());
        rahul.receiveSalary(rahul.getSalary());
        System.out.println("DPS has spent for salary to " +rahul.getName() + " and now has $ " +dps.getTotalMoneyEarned());
    }
}
