import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=scan.nextInt();
		
		if(n%2==0) {
			System.out.println("Even Number:"+n);
		}
		else {
			System.out.println("Odd number:"+n);
		}

	}

}
