package day4;
import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=scan.nextInt();
		
		int i=1,sum=0;
		System.out.println("Number from 1 :"+n+":");
		do {
			System.out.println(i+" ");
			sum=sum+i;
			i++;
			
		}
		while(i<=n); {
			System.out.println("sum of numbers"+n+":"+sum);
		}

	}

}
