package Stream;
import java.util.Arrays;
import java.util.List;

public class StreamMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> mylist=Arrays.asList(10,99,12,13,14,15);
		int max=mylist.stream().max(Integer::compare).get();
		System.out.println(max);
	}
}
