package adding4years;

import  java.time.LocalDate;
import  java.util.Calendar;


public class addingyears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDate currentDate = LocalDate.now();
		 //new date with a calendr cls
		 LocalDate newDate = currentDate.plusYears(4);
		 // printing the new date after adding
		 System.out.println("Current Date: " + currentDate);
	        System.out.println("Date after adding 4 years: " + newDate);
		      
  }
}