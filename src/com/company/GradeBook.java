package com.company;

public class GradeBook {
    private String courseName; // name of course this book represent
    private int[] grades; // list of students grades

    //constructor
    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    // method for setting courseName
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // method for accessing students grades
    public void accessStudentGrades() {
        accessGrades();

        //call method getAverage to calculate the average grade
        System.out.printf("%nClass Average is %.2f%n", getAverage());

        //call the method getMinimum and getMaximum
        System.out.printf("Lowest grade is %d%nHihest grade is %d%n%n",
                getMinimum(), getMaximum());

        // call outputBarChat to print grade distribution chart

        outputBarChat();
    }

    // find minimum grade
    public int getMinimum() {
        int lowGrade = grades[0]; // we assume grade [0] is the smallest

        // loop through grades array
        for (int grade : grades) {
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
        for (int grade : grades) {
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
        return (double) total / grades.length;

    }

    //output barChat displaying grade distribution
    public void outputBarChat() {
        System.out.println("Grade Distribution");

        //stores frequency  of grades in each range of 10 grades
        int[] frequency = new int[11];
        // for each grade increment the appropriate frequency
        for (int grade : grades)
            ++frequency[grade / 10];

        // for each grade frequency, print bar in chat
        for (int count = 0; count < frequency.length; count++) {
            // output bar label ("00-09: ", ..., "90-99: "..., "100: ")
            if (count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ",
                        count * 10, count * 10 + 9);

            // print bar of asteriks
            for (int stars = 0; stars < frequency[count]; stars++)
                System.out.print("*");

            System.out.println();
        }
    }

    //to output each students grades
    public void accessGrades() {
        System.out.printf("the grades are:%n%n");


        for (int student = 0; student < grades.length; student++)
            System.out.printf("Student %2d: %3d%n",
                    student + 1, grades[student]);
        }
}

