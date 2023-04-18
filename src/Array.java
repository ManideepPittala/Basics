import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements: ");
	        int p = scanner.nextInt();
	        int q= scanner.nextInt();
	        int r = scanner.nextInt();
	        int sum=0;

	        ArrayList<Integer> arr1 = new ArrayList<Integer>(p);

	        System.out.println("Enter the elements: ");
	        for (int i = 0; i < p; i++) {
	            int element = scanner.nextInt();
	            arr1.add(element);
	            sum=sum+element;
	        }

	        System.out.println("The list is: " + arr1);
	        System.out.println(sum);
	        ArrayList<Integer> arr2 = new ArrayList<Integer>();
	        System.out.println("Enter the elements: ");
	        for (int i = 0; i < q; i++) {
	            int element = scanner.nextInt();
	            arr2.add(element);
	        }

	        System.out.println("The list is: " + arr2);
	        ArrayList<Integer> arr3 = new ArrayList<Integer>();
	        System.out.println("Enter the elements: ");
	        for (int i = 0; i < r; i++) {
	            int element = scanner.nextInt();
	            arr3.add(element);
	        }

	        System.out.println("The list is: " + arr3);
	}
		public static int[] findMinimumDifference(int[] arr1, int[] arr2, int[] arr3) {
		    Arrays.sort(arr1);
		    Arrays.sort(arr2);
		    Arrays.sort(arr3);
		    int i = 0, j = 0, k = 0;
		    int a = arr1[0], b = arr2[0], c = arr3[0];
		    int minDiff = Integer.MAX_VALUE;
		    while (i < arr1.length && j < arr2.length && k < arr3.length) {
		        int diff = Math.abs(a-b) + Math.abs(b-c) + Math.abs(c-a);
		        if (diff < minDiff) {
		            minDiff = diff;
		        }
		        int minVal = Math.min(a, Math.min(b, c));
		        if (a == minVal) {
		            i++;
		            if (i < arr1.length) {
		                a = arr1[i];
		            }
		        } else if (b == minVal) {
		            j++;
		            if (j < arr2.length) {
		                b = arr2[j];
		            }
		        } else {
		            k++;
		            if (k < arr3.length) {
		                c = arr3[k];
		            }
		        }
		    }
		    return new int[] {a, b, c};
	
		}

	}




		
		
	        
	        
//	        int[] arr1 = { 1, 2, 3, 4, 5 };
//	        int[] arr2 = { 2, 3, 4, 5, 6 };
//	        int[] arr3 = { 3, 4, 5, 6, 7 };

//	        int a = arr1[0], b = arr2[0], c = arr3[0];
//	        int diff = Math.abs(a - b) + Math.abs(b - c) + Math.abs(c - a);
//
//	        for (int i = 0; i < arr1.length; i++) {
//	            for (int j = 0; j < arr2.length; j++) {
//	                for (int k = 0; k < arr3.length; k++) {
//	                    int tempA = arr1[i], tempB = arr2[j], tempC = arr3[k];
//	                    int tempDiff = Math.abs(tempA - tempB) + Math.abs(tempB - tempC) + Math.abs(tempC - tempA);
//	                    if (tempDiff < diff) {
//	                        a = tempA;
//	                        b = tempB;
//	                        c = tempC;
//	                        diff = tempDiff;
//	                    }
//	                }
//	            }
//	        }
//
//	        System.out.println("Minimum sum of absolute differences is: " + diff);
//	        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
//}
//}
