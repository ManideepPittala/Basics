import java.util.Scanner;

public class SameOrderString {
	
    public static void main(String[] args) {
//        String textString = "abcBjhgAhGjhfhAljhRkhgRbhjbevfhO";
//        String sampleString = "BGA";
    	Scanner scan = new Scanner(System.in);
        System.out.print("Enter text string: ");
        String textString = scan.nextLine();
        System.out.print("Enter sample string: ");
        String sampleString = scan.nextLine();

        int i = 0, j = 0;

        while (i < textString.length() && j < sampleString.length()) {
            if (textString.charAt(i) == sampleString.charAt(j)) {
                j++;
            }
            i++;
        }

        if (j == sampleString.length()) {
            System.out.println("Sample string is in the same order in the text string");
        } else {
            System.out.println("Sample string is not in the same order in the text string");
        }
    }
}
