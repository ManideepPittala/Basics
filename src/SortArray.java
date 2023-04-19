import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int[] numbers={5,2,8,3,1,9,4,6,7};

		Arrays.sort(numbers);

		System.out.println("Sorted array in ascending order:");

		for(int number:numbers) {

			System.out.println(number+" ");

		}

	}

}