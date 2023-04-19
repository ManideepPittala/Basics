import java.util.Scanner;

public class Occurrence {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		//Read the array from user input

		System.out.println("enter the number of elements:");

		int n=sc.nextInt();

		int[] arr=new int[n];

		System.out.println("enter %d integers separated by space:");

		for(int i=0;i<n;i++) {

			arr[i]=sc.nextInt();

		}

		//read the integer to search for

		System.out.println("enter the integer to serach for:");

		int target=sc.nextInt();

		//count the occurrence of the integer

		int count=0;

		for(int i=0;i<n;i++) {

			if(arr[i]==target) {

				count++;

			}

		}

		//print the result

		System.out.println(target);

	}

}