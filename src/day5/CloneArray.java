package day5;
import java.util.Arrays;

public class CloneArray {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int[] arr1={1,2,3,4,5};

		int[] arr2=arr1.clone();

		System.out.println("Original aray:"+Arrays.toString(arr1));

		System.out.println("Cloned array:"+Arrays .toString(arr2));
	}


}