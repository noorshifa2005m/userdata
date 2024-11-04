/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package schoolreportcardcalculator;

import java.util.Scanner;

public class SchoolReportCardCalculator {

    
    
    public static void main(String[] args) {
        // TODO code a/**pplication logic here
        // Scanner class object
        Scanner ref=new Scanner(System.in);
        
        // printing "Enter your name"
        System.out.println("Enter your Name");
        
        //String value input
        String Name=ref.nextLine();
        
        // printing the name
        //System.out.println("Your name is "+Name);
        
        //print "Enter your roll number"
        System.out.println("Enter your roll number");
        
        // user input of roll number
        int rollnumber = ref.nextInt();
        
        // printing the "Enter 5 marks "
        System.out.println("Enter the marks of 5 subjects");
        
        int english = ref.nextInt();
        int hindi = ref.nextInt();
        int maths = ref.nextInt();
        int science = ref.nextInt();
        int Java = ref.nextInt();
        
        // total marks will be 500 as one subject is of 100 marks (5*100=500)
        int totalmarks2 = 500;
        
        System.out.println("Thanks For Your Input... your result is being processing\n");
        
        // for getting total marks
        int totalmarks = english+hindi+maths+science+Java;
        
        //printing 
        System.out.println("Your input is recieved and please wait for the output .....");
        
        //printing total marks...
        System.out.println("Your Total Marks are "+totalmarks+" out of "+totalmarks2);
        
        // for calculating percentage
        /*
        for eg. lets say 390 out of 500
        
        390/500*100 = 390/5 = percentage
        
        */
        
        float percentage = totalmarks/5;
        
        // for printing final percentage
        System.out.println("Your Percentage is "+percentage);
    }
    
}
