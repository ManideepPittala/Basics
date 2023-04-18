import java.util.Scanner;

public class PositiveNegativeOrZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		
		if(n>0) {
			System.out.println("Positive number:"+n);
		}
		else if(n<0) {
			System.out.println("Negative number:"+n);
		}
		else {
			System.out.println("equals to Zero");
		}

	}

}
