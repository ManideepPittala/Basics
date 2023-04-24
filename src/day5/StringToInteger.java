package day5;
import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter string:");
//		String str=scan.nextLine();
		
		//String To Integer
		String str="11111";
		int num=Integer.parseInt(str);
		System.out.println(num);
		
		
		//double to integer
		double d=30.86;
		int n=(int)d;
		System.out.println(n);
		
		//String to double
		String s="1111";
		double p=Double.parseDouble(s);
		System.out.println(p);
	}

}
