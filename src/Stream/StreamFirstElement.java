package Stream;
import java.util.Arrays;
import java.util.List;

public class StreamFirstElement {
	public static void main(String[] args) {
		List<Integer> mylist=Arrays.asList(1,2,3,4,5,6);
		mylist.stream().findFirst().ifPresent(System.out::println);
		
	}

}
