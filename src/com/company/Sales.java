package com.company;
//7.10 (Sales Commissions) Use a one-dimensional array to solve the following problem: A com-
//        pany pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of
//        their gross sales for that week. For example, a salesperson who grosses $5,000 in sales in a week re-
//        ceives $200 plus 9% of $5,000, or a total of $650. Write an application (using an array of counters)
//        that determines how many of the salespeople earned salaries in each of the following ranges (assume
//        that each salesperson’s salary is truncated to an integer amount):
//        a) $200–299
//        b) $300–399
//        c) $400–499
//        d) $500–599
//        e) $600–699
//        f) $700–799
//        g) $800–899
//        h) $900–999
//        i) $1,000 and over
//        Summarize the results in tabular format.

import java.util.Scanner;

public class Sales {
    public static void salesComm() {
        int count;
        int sales [] = new int [10];
        int grossSales;
        int [] frequency = new int [10];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Gross sales for the week:");

        for (count = 0; count < sales.length; count++) {
            grossSales = input.nextInt();

            sales[count] = (int) ((200 + (0.09 * grossSales)));
            if (sales[count] / 100 >= 10) {
                ++frequency[count];
            }
            else if(sales[count] / 100 <= 9) {
                ++frequency[count];
            }
        }
        System.out.println("Salary Range \t Number of people");
        for(count = 1; count < sales.length; count++) {
            for (count =1; count < sales.length; count++) {
                if (count == 9 ) {
                    System.out.println(" $ 1000 and above");
                }
                else {
                    System.out.println("$ " + (100 + (100 * count) + "-" + (199 + (count * 100)))+"\t\t"+ frequency[count]);
                    input.close();
                }
            }
        }
    }
}
