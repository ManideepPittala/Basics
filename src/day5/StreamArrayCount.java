package day5;
import java.util.Arrays;
import java.util.List;

public class StreamArrayCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> mylist=Arrays.asList(10,1,2,3,4,5,6,7,89);
		long count=mylist.stream().count();
		System.out.println(count);

	}

}
