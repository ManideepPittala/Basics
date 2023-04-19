import java.util.Scanner;

public class ArmstrongMagic {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num=sc.nextInt();

		//check if the number is Armstrong

		int sum=0;

		int temp=num;

		int digits=String.valueOf(num).length();

		while(temp>0) {

			int remainder=temp%10;

			sum+=Math.pow(remainder,digits);

			temp/=10;

		}

		if(num==sum) {

			System.out.println(num + " is an Armstrong number");

		}

		else {

			System.out.println(num + "is not an Armstrong number");

		}

		//check if the number is magic number

		int magicNumber=0;

		while(num>9) {

			int digitSum=0;

			while(num>0) {

				digitSum+=num%10;

				num/=10;

			}

			num=digitSum;

			magicNumber=digitSum;

		}

		if(magicNumber==1) {

			System.out.println(num +"is a magic number");

		}

		else {

			System.out.println(num +"is not a magic number");

		}



	}


}