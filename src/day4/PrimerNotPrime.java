package day4;
import java.util.Scanner;

public class PrimerNotPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("input integer");
		int n=sc.nextInt();
		int i=3,count=0;
		while(i<=n/2) {
			if(n%i==0) {
				count++;
				break;
				
			}
			i++;
		}
		if(count==0 && n>1) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}

	}

}
