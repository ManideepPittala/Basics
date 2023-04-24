package Stream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> mylist=Arrays.asList(10,10,20,20,15,16,16);
		Set<Integer> set=new HashSet<>();
		mylist.stream().filter(n->!set.add(n)).forEach(System.out::println);

	}

}
