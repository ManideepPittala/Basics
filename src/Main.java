import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text string: ");
        String text = sc.nextLine();
        System.out.print("Enter sample string: ");
        String sample = sc.nextLine();
        
        boolean result = isSameOrder(text, sample);
        
        if (result) {
            System.out.println("The characters of  sample string are in the same order in  text string.");
        } else {
            System.out.println("The characters of sample string are not in the same order in  text string.");
        }
    }
    
    public static boolean isSameOrder(String text, String sample) {
        int i = 0;
        int j = 0;
        
        while (i < text.length() && j < sample.length()) {
            if (text.charAt(i) == sample.charAt(j)) {
                j++;
            }
            i++;
        }
        
        return (j == sample.length());
    }
}