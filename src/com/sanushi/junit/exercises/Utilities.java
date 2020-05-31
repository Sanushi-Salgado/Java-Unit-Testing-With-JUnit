package com.sanushi.junit.exercises;


/**
 * Created by Sanushi Salgado on 29/05/2020
 */
public class Utilities {

    public int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public String printGrade(int grade) {
        if(grade >= 75)
            return "You got an A";
        else if(grade >= 65)
            return "You got a B";
        else if(grade >= 55)
            return "You got a C";
        else if(grade >= 45)
            return "You got a S";
        else
            return "You got a F";
    }

}
