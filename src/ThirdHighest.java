import java.util.Arrays;

public class ThirdHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,8,4,5};
		int n=arr.length;
		
		int thirdHighest=getThirdHighest(arr,n);
		System.out.println(thirdHighest);

	}

	private static int getThirdHighest(int[] arr, int n) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		return arr[n-3];
	}

}
