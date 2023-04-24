package day5;
import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=scan.nextInt();
		
		int a=0,b=1;
		System.out.println("Fibonacci Sequence:"+n+":");
		while(a<=n) {
			System.out.println(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}

	}

}
