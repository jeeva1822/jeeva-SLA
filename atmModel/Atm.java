package atmModel;

import java.util.Scanner;

public class Atm {
	
	public static void main(String[] args) {
		
	   Scanner myScan=new Scanner(System.in);	
	   double init = 10000.0;
		
	   
	   while(true)
	   {
		  
		   
		   System.out.println("enter 1 for balance");
		   System.out.println("enter 2 for deposit");
		   System.out.println("enter 3 for widthdraw");
		   System.out.println("enter 4 for Exit");
		   System.out.println("enter any of the number:");
	   
		   int choice=myScan.nextInt();
		   
	   switch(choice)
	   {
	    
	       
  case 1:
		   
		   System.out.println("your current Balance is:"+init);
		   
		   break;
  case 2:
	   System.out.print("Enter the amount to deposit: ");
	   double depositAmount = myScan.nextDouble();
	   if (depositAmount > 0) 
	   { 
	     init += depositAmount; 
	     System.out.println("Deposit successful! Your new balance is: " + init); 
	   } 
	   
	   else 
	   {
		 System.out.println("Invalid amount. Please enter a positive number.");
	   }
	   
	   break;
		   
  case 3:
	  
	  System.out.print("Enter the amount to withdraw: "); 
	  double withdrawAmount = myScan.nextDouble();
	  if (withdrawAmount > 0 && withdrawAmount <=init)
	  { 
		  init -= withdrawAmount; 
	      System.out.println("Withdrawal successful! Your new balance is: " + init); 
	  } 
	  
	  else if (withdrawAmount > init) 
	  { 
		  System.out.println("Insufficient funds. Your current balance is: " + init);
	  }
	  else
	  {
		  System.out.println("Invalid amount. Please enter a positive number."); 
	  } 
	  
	  break;
	   
	   
  case 4:
	   
	  System.out.println("Thank you for using the ATM. Goodbye!");
	  myScan.close();
	  return; 
	  
	  
	  default:
		  
	  System.out.println("Invalid choice. Please try again.");
	   
  }
	   }
		
	}

}
