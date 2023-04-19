public class SumArray {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		//define and initialize anonymous array

		int[] arr={1,2,3,4,5};

		//call the sumarray method and pass the anonymous array

		sumArray(arr);

	}

	public static void sumArray(int[] arr) {

		int sum=0;

		for(int i=0;i<arr.length;i++) {

			sum+=arr[i];

		}

		System.out.println("sum of the array:"+sum);

	}

}