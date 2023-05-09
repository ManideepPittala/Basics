package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> nums=new ArrayList<Integer>();
		nums.add(6);
		nums.add(10);
		nums.add(19);
		nums.add(14);
		
		for(int n:nums)
		System.out.println(n);
		System.out.println(nums);
		

	}
	

}
