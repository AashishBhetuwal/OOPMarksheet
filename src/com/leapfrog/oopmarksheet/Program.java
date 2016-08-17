/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.oopmarksheet;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int subjectNum;
        while (true) {
            
            System.out.println("Enter the no of Subjects:");
            subjectNum = sc.nextInt();
            Entry e = new Entry(subjectNum);
            e.subjectsEntry();
            e.percentage();
            e.division();
            System.out.println("Do you want to continue? [Y/N]");
            String a = sc.next();
            if (a.equalsIgnoreCase("N")) {
                System.out.println("Thank You");
                System.exit(0);
            }
        }
    }

}
