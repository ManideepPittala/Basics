package day5;
public class MinMaxArray {
	
	public static void main(String[] args)
	{
		

		// TODO Auto-generated method stub

		int[] numbers= {10,5,15,7,20,1};

		int min=numbers[0];

		int max=numbers[0];

		for(int i=1;i<numbers.length;i++) {

			if(numbers[i]<min) {

				min=numbers[i];

			}

			if(numbers[i]>max) {

				max=numbers[i];

			}

		}

		System.out.println("Minimun number in the array: "+min);

		System.out.println("Maximum number in the array: "+max);

	}
}