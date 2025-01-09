package newpack;

import java.util.Scanner;

public  class CaloriesEnum {
	
	
	
	static Scanner s1=new Scanner(System.in);
	static int a=s1.nextInt();
	
	
	
	enum men {BREAKFAST(500),LUNCH(500),SNACK(100),DINNER(500);
		private int value;
		private men(int value)
		{
			this.value=value;
		}
	}

	enum women {BREAKFAST(400),LUNCH(400),SNACK(50),DINNER(400);
		private int value;
		private women(int value)
		{
			this.value=value;
		}
	}


	public static void main(String[] args) {
		
		
		   if(a==1)
		   {

				for(men m:men.values())
				{
					System.out.println(m+" "+m.value);
				}
				
		   }
		
		   else
		   {
			   for(women m:women.values())
				{
					System.out.println(m+" "+m.value);
				}
		   }
			
			
		}
	}


