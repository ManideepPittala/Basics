package day5;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateArray {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int[] numbers= {1,2,3,2,1,4,5,4,3};

		Set<Integer>duplicates=new HashSet<>();

		Map<Integer,Integer>countMap=new HashMap<>();

		for(int number :numbers) {

			if(countMap.containsKey(number)) {

				countMap.put(number,countMap.get(number)+1);

				duplicates.add(number);

			}else {

				countMap.put(number,1);

			}

		}

		System.out.println("Duplicates in the array:"+duplicates);

		System.out.println("Count of duplicates:"+duplicates.size());

		for(int number:duplicates) {

			for(int i=0;i<numbers.length;i++) {

				if(numbers[i]==number) {

					numbers[i]=0;
				}

			}

		}

		System.out.println("Array with duplicates removed:"+Arrays.toString(numbers));
	}
}