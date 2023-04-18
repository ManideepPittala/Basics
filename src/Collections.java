import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("Mani");
		list.add("Deep");
		list.add("csk");
		
		for(String str:list) {
			System.out.println(str);
		}
		
		Set<Integer> set=new HashSet<>();
		set.add(1);
		set.add(20);
		set.add(12);
		
		for(Integer n:set) {
			System.out.println(n);
		}
		
		Map<String, Integer> map=new HashMap<>();
		map.put("java",1);
		map.put("mani",2);
		map.put("Csk",5);
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

	}

}
