package task5loops;


import java.util.Scanner;

public class FoodMenu {

	public static void main(String[] args) {
		
		Scanner FoodMenu=new Scanner(System.in);
		System.out.println("Choose 1 for Non-veg or choose 2 for veg ");
		
		int food=FoodMenu.nextInt();
		
		switch(food)
		{
		
		case 1:System.out.println("1.Mutton Biryani \n1 2.Chicken Biryani\n2 3.Muttun Chukka\n3 4.Chicken 65\n4  5.Mutton Chettinadu");
		break;
		case 2:System.out.println("1.Veg Biryani \n5 2.Mushroom Biryani \n6 3.Pannerbutter Masala \n7 4.panner 65 2\n8  5.mushroom Chettinadu");
		break;
		default ://no need to break
			System.out.println("invalid");
		}
		
		System.out.println("your's Today menu items are"+ food);
	}

}
