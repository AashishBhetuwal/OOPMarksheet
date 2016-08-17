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
public class Entry {

    Scanner sc = new Scanner(System.in);
    int subjectNum, total = 0, percentage;
    int[] marks;
     String[] subjects; 
     
     

   

   public  Entry(int subjectNum) {
       subjects=new String[subjectNum];
       marks=new int[subjectNum];
       this.subjectNum = subjectNum;
        
    }

    public void subjectsEntry() {

        subjects = new String[subjectNum];

        for (int i = 0; i < subjects.length; i++) {
            System.out.println("Enter Subject:");
            subjects[i] = sc.next();
        }
        System.out.println("=====================");
        System.out.println("Entered subjects are:");
        for (String subject : subjects) {
            System.out.println(subject);
        }

         marks = new int[subjectNum];

        for (int i = 0; i < subjects.length; i++) {
            System.out.println("=====================");
            System.out.println("Enter the marks in " + subjects[i]);
            marks[i] = sc.nextInt();
            while (!(marks[i] > 0 && marks[i] < 100)) {
                System.out.println("Invalid Marks!");
                marks[i] = sc.nextInt();
            }

        }
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("=======================");
            System.out.println(" Marks in " + subjects[i] + " is " + marks[i]);

            total = total + marks[i];

        }

        System.out.println("=========================");
        System.out.println(" Total marks is " + total);

    }

    public void percentage() {

        System.out.println("==========================");

        percentage = (total / subjectNum);
        System.out.println("The percentage is:" + percentage + "%");

    }
    
    public boolean passFail(){
        for(int i=0;i<subjectNum;i++)
        {
            if(marks[i]<32){
                return false;
            }
        
        }
        return true;
    }

    public void division() {
            
        if(passFail()==false){
                System.out.println("You fail!");
            }
        
            else if (percentage >= 80) {
            System.out.println("You secured Distinction!");
        } else if (percentage < 80 && percentage >= 60) {
            System.out.println("You secured First division");
        } else if (percentage < 60 && percentage >= 40) {
            System.out.println("You secured Second division");
        } else if (percentage < 40 && percentage >= 32) {
            System.out.println("You secured Third division");
        }
        total = 0;

    }

}
