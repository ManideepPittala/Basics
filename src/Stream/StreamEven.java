package Stream;
import java.util.Arrays;
import java.util.List;

public class StreamEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> mylist=Arrays.asList(10,7,8,6,15);
		mylist.stream().filter(n->n%2==0).forEach(System.out::println);

	}

}
