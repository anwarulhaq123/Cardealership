/* Assignment No.1
Author : Muhammad Anwar Ul Haq
Student Id: L00162311
Date: 12/01/2021
Subj: Software development*/



// Import packag containing predefined Scnner class
import java.util.Scanner;

public class CarDealership2
 {

    public static void main(String[] args)
    {
	     // Declare the variables
        char employee;
        double annualSalary, monthlySalary, carSoldBonus = 0, vanSoldBonus = 0, totalBonus = 0, totalPayment;
        int longServiceBonus= 750, carsSold, vansSold , yearsWork;

         // create instance of Scanner class
          Scanner keyboardIn = new Scanner(System.in);
        
          //prompt user to enter Employee type 
          System.out.print("Please enter your employee type (S for sales, M for mechanic): ");
          
          //Read input from keyboard and assign to char variable employee.
          employee = keyboardIn.next().charAt(0);
            
          // if statment if employee choose the "S or s " option
          if(employee == 'S' || employee == 's' )
         {
            // Propmpt user to Enter the annual Salary  
            System.out.print("Please enter your annual salary €: ");
            
            //Read input from Keyboard and assign it double varibale annualSalary
            annualSalary = keyboardIn.nextDouble();
            
            // Prompt user to Enter How many years he is working
            System.out.print("\nHow many years have you worked here? ");
            
            //Read input from Keyboard and assign it int varibale yearsWork 
            yearsWork = keyboardIn.nextInt();
            
            // Prompt user to Enter How many cars he sold in a month
            System.out.print("How many cars did you sell this month? ");
            
            //Read input from Keyboard and assign it int varibale carsSold 
            carsSold = keyboardIn.nextInt();
            
            // Prompt user to Enter How many vans he sold in a month
            System.out.print("How many vans did you sell this month? ");
            
            //Read input from Keyboard and assign it int varibale vansSold 
            vansSold = keyboardIn.nextInt();
            
            // Display the monthly Pay details on the screen 
            System.out.println("\nMonthly Pay details: ");
            
            // Display the annual salary on the screen 
            System.out.println("Annual salary €: " + annualSalary);
            
            // Calculate the monthly salary of the employee
            monthlySalary = annualSalary / 12;
            
            //Display the monthly salary on the screen 
            System.out.println("Monthly salary €: " + monthlySalary);
            
            // if statment to Check if the Employee has sold minimum one car and he is working minimum 2 years.
            if (carsSold == 1 && yearsWork >= 2)
             {
                carSoldBonus = (annualSalary * 5)/100;
                System.out.println("Car sales bonus €: " + carSoldBonus);
             }
            //else if statment to Check if the Employee has sold more tha 2 cars and less 4 or equall to 4 cars.
             else if (carsSold >= 2 && carsSold <= 4 && yearsWork >= 2)
             {
                carSoldBonus = (annualSalary * 7)/100;
                System.out.println("Car sales bonus €: " + carSoldBonus);
             } 
            //else if statment to Check if the Employee has sold more than or equall to  5 cars.
            else if (carsSold >= 5 && yearsWork >= 2)
             {
                carSoldBonus = (annualSalary * 10) / 100;
                System.out.println("Car sales bonus €: " + carSoldBonus);
             }
            // else if statment to Check if the Employee has sold 0 cars.
            else if(carsSold == 0 && yearsWork >=2)
             {
                System.out.println("Car sales bonus €: "+ carSoldBonus);
             }
           // If block to calculte the emplyee bonus if he sold less than or equall to 5 vans.
            if( vansSold <= 5 && yearsWork >= 2)
           {
                vanSoldBonus = vansSold * 1000;
                System.out.println("Van sales bonus €: "+ vanSoldBonus );
           }
            //else if block to calculte the emplyee bonus if he sold 6 or more vans.
            else if(vansSold > 5 && yearsWork >= 2 )
           {
                 vanSoldBonus =  (vansSold - 5) * 1200 + 5000;
                System.out.println("Van sales bonus €: "+ vanSoldBonus );
           }
            // if block to check if the employee is eligibal for long service bonus 
           if(yearsWork > 5)
           {
                System.out.println("Long service bonus €: " + longServiceBonus + ".0");
                // Calculate the total bonus 
                totalBonus = carSoldBonus + vanSoldBonus + longServiceBonus;
                // Display the the total bonus on the screen.
                System.out.println("Total bonus €: " + totalBonus);
           }
           
           // Chek if the employee work less than 2 Years 
            else if(yearsWork < 2)
           {
             // Display on the screen if the employee not eligible for bonus 
             System.out.println("As you have worked here for less than 2 years, you do not qualify for a bonus.");
                        
           }
            else
           {
                System.out.println("Long service bonus €: 0.0");
                totalBonus = carSoldBonus + vanSoldBonus;
                System.out.println("Total bonus €: " + totalBonus);
           }
           
            // Calculate the total payment of employee in a month
            totalPayment = monthlySalary + totalBonus;
            
            // Display the total payment on the screen 
            System.out.println("Total payment for this month €: " + totalPayment);
            
            // If- else if and  else statments to display how many cars and vans employee sold.
           if(carsSold == 1 && vansSold == 1)
           {
                System.out.println("This month you sold "+ carsSold +" car and " + vansSold +" van.");
           }
           else if(carsSold == 1 && vansSold > 1)
           {
                System.out.println("This month you sold "+ carsSold +" car and " + vansSold +" vans.");
           }
            else if( carsSold > 1 && vansSold == 1)
           {
                System.out.println("This month you sold "+ carsSold +" cars and " + vansSold +" van.");
           }
           else if( carsSold == 0 && vansSold == 1)
           {
                System.out.println("This month you sold "+ carsSold +" car and " + vansSold +" van.");
           }
           else if(carsSold == 1 && vansSold == 0)
           {
                System.out.println("This month you sold "+ carsSold +" car and " + vansSold +" van.");
           } 
           else if(carsSold == 0 && vansSold == 0)
           {
                System.out.println("This month you sold "+ carsSold +" car and " + vansSold +" van.");
           } 
           else if(carsSold > 1  && vansSold == 0)
           {
                System.out.println("This month you sold "+ carsSold +" cars and " + vansSold +" van.");
           }
           else if(carsSold == 0  && vansSold > 1)
           {
                System.out.println("This month you sold "+ carsSold +" car and " + vansSold +" vans.");
           }
           else
           { 
               System.out.println("This month you sold "+ carsSold +" cars and " + vansSold +" vans.");
           }         
        }
        
        // else if statment if employee choose the "M or m " option as employee
        else if( employee == 'M' || employee == 'm')
        {
            //Propmpt user to Enter the annual Salary
            System.out.print("Please enter your annual salary €: ");
            
            //Read input from keyboard and assign to double varibale annualSalary.
            annualSalary = keyboardIn.nextDouble();
            
            // Display the monthly pay detail on the screen
            System.out.println("Monthly Pay details:");
            System.out.println("Annual salary €: " + annualSalary);
            monthlySalary = annualSalary/12;
            System.out.println("Monthly salary €: " + monthlySalary);
        }
        //  Check If user enter the invalid employee type.
        else
        {
            System.out.println("\nInvalid Employee type.");
        }
        

    }// End Main Method
}// End Main Class
