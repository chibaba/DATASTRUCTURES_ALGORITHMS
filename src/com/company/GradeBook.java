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
}
