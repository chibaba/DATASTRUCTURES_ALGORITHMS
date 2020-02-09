package com.company;

public class GradeBook {
    private String courseName; // name of course this book represent
    private int[] grades; // list of students grades

    //constructor
    public GradeBook( String courseName, int[] grade) {
        this.courseName = courseName;
        this.grades = grades;
    }
    // method for setting courseName
    public void setCourseName(String courseName ) {
        this.courseName = courseName;
    }
    // method for accessing students grades
    public int accessStudentGrades() {
         accessGrades();

         //call method getAverage to calculate the average grade
        System.out.printf("%nClass Average is %.2f%n", getAverage());

        //call the method getMinimum and getMaximum
        System.out.printf("Lowest grade is %d%nHihest grade is %d%n%n",
                getMinimum(), getMaximum());

        // call outputBarChat to print grade distribution chart

        outputBarchat();
    }
    // find minimum grade
    public int getMinimum() {
        int lowGrade = grades[0]; // we assume grade [0] is the smallest

        // loop through grades array
        for (int grade : grades)
        {
            // if grade is lower than lowerGrade, assign it to lowGrade
            if (grade < lowGrade)
                lowGrade = grade; // new lowest Grade
        }
        return lowGrade;

    }
    // find maximum grade
    public int getMaximum() {
        int highGrade = grades[0];
        //loop through grade array
        for (int grade : grades)
        {
            // if grade is higher than grade, we set the grade to higher grade
            if (grade > highGrade)
                highGrade = grade;
        }
        return highGrade;
    }

    // determine average Grade for test
    public double getAverage() {
        int total = 0;

        //sum grade for one student
        for (int grade : grades)
            total += grade;

        // return average of grades
        return (double) total/grades.length;

    }
}
