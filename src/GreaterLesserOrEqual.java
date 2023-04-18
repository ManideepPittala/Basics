import java.util.Scanner;

public class GreaterLesserOrEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("First number:");
		int a=scan.nextInt();
		System.out.println("Second number: ");
		int b=scan.nextInt();
		
		
		if(a>b) {
			System.out.println("Greater number is:"+a);
		}
		else if(a<b) {
			System.out.println("Greater number is:"+b);
		}
		else {
			System.out.println("Both numbers are equal");
		}

	}

}
