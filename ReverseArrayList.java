package newpack;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		
		int i=10;
		
		ArrayList<Integer> al1=new ArrayList<>();
		
		for(i=1;i<=10;i++)
		{
			al1.add(i);
		}
		
		Collections.reverse(al1);
		
		System.out.println(al1);

	}

}
