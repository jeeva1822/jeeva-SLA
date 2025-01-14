package newpack;


import java.time.LocalDate;
import java.time.DayOfWeek;

public enum DaysofWeek {


	        MONDAY,
	        TUESDAY,
	        WEDNESDAY,
	        THURSDAY,
	        FRIDAY,
	        SATURDAY,
	        SUNDAY;
	    

	    public static void main(String[] args) {
	        LocalDate currentDate = LocalDate.now();
	        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
	        
	        DaysofWeek  today = DaysofWeek .valueOf(dayOfWeek.name());
	        
	        System.out.println("Today is: " + today);
	    }
	}


