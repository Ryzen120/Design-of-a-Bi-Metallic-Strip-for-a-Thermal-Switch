import java.util.Scanner;
import java.util.ArrayList;

/**
 * This class tests the method of the Equation class. Calling the needed method to solve for the curvature equation.
 * 
 * @author Robert Lenko
 * @date April 11, 2019
 * @version 1.0.1
 *
 */
public class ProjectTester 
{

	    public static void main(String[] args)
	    {
	        
	       //Creation of Scanner object.
	       Scanner in = new Scanner(System.in);
	       
	       //Message displayed that program was initiated.
	       System.out.println("* * * Project Started * * *");
	       System.out.println();
	       
	       //Array to store all E values from book.
	       ArrayList<Double> possibleEvalues = new ArrayList<>();
	       
	       //Array to store all Alpha values from book.
	       ArrayList<Double> possibleAlphavalues = new ArrayList<>();
	       
	       
	       //------------------------------------ Ferrous Metals -----------------------------------------
	       
	       //Wrought Iron
	       possibleEvalues.add(28000000.0);
	       possibleAlphavalues.add(0.0000067);
	       
	       //Structural Steel
	       possibleEvalues.add(29000000.0);
	       possibleAlphavalues.add(0.0000066);
	       
	       //Steel 0.2% C Hardened
	       possibleEvalues.add(30000000.0);
	       possibleAlphavalues.add(0.0000066);
	       
	       //Cast - Iron --- Gray
	       possibleEvalues.add(15000000.0);
	       possibleAlphavalues.add(0.0000067);
	       
	       //Cast - Iron --- Mailable
	       possibleEvalues.add(25000000.0);
	       possibleAlphavalues.add(0.0000066);
	       
	       //Cast - Iron --- Nodular
	       possibleEvalues.add(25000000.0);
	       possibleAlphavalues.add(0.0000066);
	       
	       //Stainless Steel (18 - 8) annealed
	       possibleEvalues.add(28000000.0);
	       possibleAlphavalues.add(0.0000096);
	       
	       //Stainless Steel (18 - 8) cold - rolled
	       possibleEvalues.add(28000000.0);
	       possibleAlphavalues.add(0.0000096);
	       
	       //------------------------------------ Nonferrous Metal Alloys ---------------------------------
	       
	       //Aluminum wrought, 2014 - T4
	       possibleEvalues.add(10600000.0);
	       possibleAlphavalues.add(0.0000125);
	       
	       //Aluminum wrought, 2024 - T4
	       possibleEvalues.add(10600000.0);
	       possibleAlphavalues.add(0.0000125);
	       
	       //Aluminum wrought, 6061 - T6
	       possibleEvalues.add(10000000.0);
	       possibleAlphavalues.add(0.0000125);
	       
	       //Magnesium, extrusion AZ80X
	       possibleEvalues.add(6500000.0);
	       possibleAlphavalues.add(0.0000144);
	       
	       //Magnesium, sandcast AZ63 - HT
	       possibleEvalues.add(6500000.0);
	       possibleAlphavalues.add(0.0000144);
	       
	       //Monel, wrought, hot - rolled
	       possibleEvalues.add(26000000.0);
	       possibleAlphavalues.add(0.0000078);
	       
	       //Red brass, cold - rolled
	       possibleEvalues.add(15000000.0);
	       possibleAlphavalues.add(0.0000098);
	       
	       //Red brass, annealed
	       possibleEvalues.add(15000000.0);
	       possibleAlphavalues.add(0.0000098);
	       
	       //Bronze, cold - rolled
	       possibleEvalues.add(15000000.0);
	       possibleAlphavalues.add(0.0000094);
	       
	       //Bronze, annealed
	       possibleEvalues.add(15000000.0);
	       possibleAlphavalues.add(0.0000094);
	       
	       //Invar, annealed
	       possibleEvalues.add(21000000.0);
	       possibleAlphavalues.add(0.0000006);
	       
	       //Displaying both ArrayLists with their respective data.
	       System.out.println("All possible E values " + possibleEvalues);
	       System.out.println("All possible Alpha values " + possibleAlphavalues);
	       System.out.println();
	       
	       //Variables to be entered.
	       double E1 = 0.0;
	       double E2 = 0.0;
	       
	       //Choosing Height constant of 0.009 of the Part 2 auto optimized portion of this program.
	       //User can override these values by selecting the first option instead.
	       double H1 = 0.009;
	       double H2 = 0.009;
	       
	       double Alpha1 = 0.0;
	       double Alpha2 = 0.0;
	       
	       //Ymax result.
	       double ymax = 0.0;
	       
	       
	       //Curvature result.
	       double k = 0.0;
	       
	       //Creation of Equation class object.
 		   Equation eq = new Equation(E1, E2, H1, H2, Alpha1, Alpha2);
	       
 		   
	       //True loop to keep program running until user specifies with entering 0.
	       while(true) 
	       {
	    	   
	    	   //Message with instructions on how to continue or end program.
	    	   System.out.println();
	    	   System.out.println("Press 1. to solve curvature equation by entering your own values.");
	    	   System.out.println("Press 2. to auto solve with constant values listed in code.");
	    	   System.out.println("Press 0. to exit program.");
	    	   System.out.println();
	    	   
	    	   //Taking in user input value of 1 or 0.
	    	   int x = in.nextInt();
	    	   
	    	   //If user enters 1, we ask for the values of the variables and call the method to get the result.
	    	   if(x == 1)
	    	   {
	    	   
	    		  //Displaying message of instructions to user.
	    		  System.out.println("Enter the values for the following variables of the curvature equation.");
	    		  System.out.println();
	            
	    		  //Asking for all needed variables from the user.
	    		  System.out.print("Enter your value for E1: ");
	    		  E1 = in.nextDouble();
	    		  System.out.print("Enter your value for E2: ");
	    		  E2 = in.nextDouble();
	    		  System.out.print("Enter your value for H1: ");
	    		  H1 = in.nextDouble();
	    		  System.out.print("Enter your value for H2: ");
	    		  H2 = in.nextDouble();
	    		  System.out.print("Enter your value for Alpha1: ");
	    		  Alpha1 = in.nextDouble();
	    		  System.out.print("Enter your value for Alpha2: ");
	    		  Alpha2 = in.nextDouble();
	            
	            
	    		  //Setting k = to the result produced by the curvatureSolver() method.
	    		  k =  eq.curvatureSolver(E1, E2, H1, H2, Alpha1, Alpha2);
	            
	    		  //Displaying our result to the user.
	    		  System.out.println();
	    		  System.out.println("Your result is: k = " + k);
	    		  System.out.println();
	             
	    		  //Displaying value for yMax equation based off of result from k.
	    		  System.out.println("Now computing yMax... ");
	    		  System.out.println();
	    		  System.out.println("Your yMax value is: = " + eq.yMax());
	    		  System.out.println();
	    	   }
	    	   
	    	   //Press 2 to auto solve with constant values listed in code.
	    	   else if(x == 2)
	    	   {
	    		   
	    		 //Catching inevitable ArrayIndexOutOfBoundException.
	    		 try
	    		 {
	    		   
	    		   //Keeps E1 and Alpha1 Constant at their first value while iterating through E2 and Alpha2 values.
	    		   for(int i = 1; i < possibleEvalues.size(); i++)
	    	 	   {
	    	 		   E1 =  possibleEvalues.get(0);
	    	 		   E2 = possibleEvalues.get(i);
	    	 		   Alpha1 = possibleAlphavalues.get(0);
	    	 		   Alpha2 = possibleAlphavalues.get(i);
	    	 		    	   
	    	 		   k =  eq.curvatureSolver(E1, E2, H1, H2, Alpha1, Alpha2);
	    	 			
	    	 		   
	    	 		   //Will produce all values calculated if comment is removed! (VERY LARGE AMOUNT)
	    	 		   
	    	 		   /* 
	    	 		   //Displaying our result to the user.
	    	 		   System.out.println();
	    	 		   System.out.println("Your result is: k = " + k);
	    	 		   System.out.println();
	    	 		          
	    	 		   //Displaying value for yMax equation based off of result from k.
	    	 		   System.out.println("Now computing yMax... ");
	    	 		   System.out.println();
	    	 		   System.out.println("Your yMax value is: = " + eq.yMax());
	    	 		   System.out.println();
	    	 		   */
	    	 		 		  
	    	 		     //Now changes E1 and Alpha1 values while changing E2 and Alpha2 values, but starting them from 2
	    	 		     for(int j = 1; j < possibleEvalues.size(); j++)
	    	 		 	 {
	    	 		 			  
	    	 		    	 E1 =  possibleEvalues.get(j);
	    	 	 		     E2 = possibleEvalues.get(i + 1);
	    	 	 		     Alpha1 = possibleAlphavalues.get(j);
	    	 	 		     Alpha2 = possibleAlphavalues.get(i + 1);
	    	 	 		    	   
	    	 	 		     k =  eq.curvatureSolver(E1, E2, H1, H2, Alpha1, Alpha2);
	    	 	 			 ymax = eq.yMax();
	    	 	 			     
	    	 	 			//Will produce all values calculated if comment is removed! (VERY LARGE AMOUNT)
	    	 	 			 
	    	 	 			 /*
	    	 	 			 //Displaying our result to the user.
	    	 	 		  	 System.out.println();
	    	 	 		 	 System.out.println("Your result is: k = " + k);
	    	 	 		 	 System.out.println();
	    	 	 		          
	    	 	 		 	 //Displaying value for yMax equation based off of result from k.
	    	 	 		 	 System.out.println("Now computing yMax... ");
	    	 	 		 	 System.out.println();
	    	 	 		 	 System.out.println("Your yMax value is: = " + eq.yMax());
	    	 	 		 	 System.out.println();
	    	 		 	     */
	    	 	 			 
	    	 	 		 		//Checking for our optimized value of yMax.  
	    	 	 		 		if (ymax >= 0.03 && ymax <= 0.06) 
	    	 	 		 		{
	    	 	 		 			System.out.println();
	    	 	 		 			System.out.println("---------------------------------------");
	    	 	 		 			System.out.println();
	    	 	 		 			System.out.println("Here it is! " +  ymax);
	    	 	 		 			System.out.println();
	    	 	 		 			System.out.println("Your H1 value was held constant at: " + H1);
	    	 	 		 			System.out.println("Your H2 value was held constant at " + H2);
	    	 	 		 			System.out.println("Your E1 value at this time: " + E1);
	    	 	 		 			System.out.println("Your E2 value at this time: " + E2);
	    	 	 		 			System.out.println("Your Alpha1 value at this time: " + Alpha1);
	    	 	 		 			System.out.println("Your Alpha2 value at this time: " + Alpha2);
	    	 	 		 			System.out.println("---------------------------------------");
	    	 	 		 		}
	    	 	 		 		  
	    	 		 			  
	    	 		 	  }
	    	 		 		    
	    	 	   }
	    		   
	    	   }
	    	   
	    	   //Catching our Out of bound!
	    	   catch(Exception e)
	    	   {
	    		   e.getMessage();
	    	   }
	    		 
	    	   }
	    		   
	    	   //If user enters anything else besides 1, the program will be terminated.
	    	   else
	    	   {
	    		   //Displaying that the program has ended.
	    		   System.out.println();
	    		   System.out.println("Program ended.");
	    		   
	    		   //Closing the Scanner.
	    		   in.close();
	    		   
	    		   //Breaking out of the while(true) loop.
	    	       break;
	    	       
	    	   }
	    	   
	      }

	 }
	
}
