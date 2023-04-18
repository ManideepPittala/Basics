import java.util.Scanner;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		
		for(int i=2;i<=n;i+=2) {
			System.out.println("Print Even Numbers:"+i);
		}

	}

}
