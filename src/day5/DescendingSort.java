package day5;
import java.util.ArrayList;
import java.util.Collections;

public class DescendingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(40);
		list.add(30);
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
