import java.util.Scanner;

public class SmallestMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int num = 1;
        while (true) {
            String binary = Integer.toBinaryString(num);
            int decimal = Integer.parseInt(binary, 2);
            if (decimal % a == 0) {
                System.out.println("The smallest number with 1s and 0s as its digits which is divisible by " + a + " is " + binary);
                break;
            }
            num++;
        }
    }
}