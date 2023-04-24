package day4;
import java.util.HashMap;
import java.util.Map;

public class Count {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int[] numbers= {1,2,3,2,1,4,5,4,3};

		Map<Integer,Integer>countMap=new HashMap<>();

		for(int number:numbers) {

			if(countMap.containsKey(number)) {

				countMap.put(number,countMap.get(number)+1);

			}

			else {

				countMap.put(number,1);

			}

		}

		System.out.println("Repeated values in the array:");

		for(Map.Entry<Integer, Integer>entry:countMap.entrySet()) {

			if(entry.getValue()>1) {

				System.out.println(entry.getKey()+"-"+entry.getValue()+"times");

			}

		}
	}

}