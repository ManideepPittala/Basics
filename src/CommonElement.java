public class CommonElement {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int[] arr1={1,2,3,4,5};

		int[] arr2={2,4,6,8,10};

		int i=0;

		int j=0;

		System.out.println("Common Elements:");

		while(i<arr1.length && j<arr2.length) {

			if(arr1[i]==arr2[j]) {

				System.out.println(arr1[i]+" ");

				i++;

				j++;

			}

			else if(arr1[i]<arr2[j])

				i++;

			else

				j++;

		}

	}

}