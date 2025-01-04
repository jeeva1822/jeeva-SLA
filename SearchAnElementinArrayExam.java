package newPackage;

public class SearchAnElementinArrayExam {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		
		int flag,i=0;

		for(i=0;i<=4;i++)
		{
			if(a[i]==50)
			flag=1;
			else
				flag=0;
			
			if(flag==1)
			{
				System.out.println("the position of 50 is"+ i);
			}
			else
			{
				System.out.println("the element not found");
			}
		}
		

	}

}
