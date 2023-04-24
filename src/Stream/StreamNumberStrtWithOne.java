package Stream;
import java.util.Arrays;

import java.util.List;

public class StreamNumberStrtWithOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> mylist=Arrays.asList(10,13,15,20,30);
		mylist.set(3,18);
		System.out.println(mylist);
		mylist.stream().map(s->s+" ").filter(s->s.startsWith("1")).
		forEach(System.out::println);
	}
}
