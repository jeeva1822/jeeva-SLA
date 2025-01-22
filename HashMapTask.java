package newpack;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask {

	public static void main(String[] args) {
		
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		hm.putIfAbsent("jeeva", 98);
		hm.putIfAbsent("yokesh", 91);
		hm.putIfAbsent("Sabharish", 90);
		hm.putIfAbsent("vignesh", 90);
		hm.putIfAbsent("Monika", 99);
		
		System.out.println(hm);

		for(Map.Entry<String,Integer> e:hm.entrySet())
			System.out.println("key"+" " +e.getKey()+" value"+ " "+e.getValue());
	}

}
