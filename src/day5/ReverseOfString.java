package day5;
import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=scan.nextLine();
		
		System.out.println("Reverse of string:");
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}

	}

}
