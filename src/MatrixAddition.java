import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		//get the dimensions of the matrices

		System.out.println("Enter the number of rows:");

		int rows=sc.nextInt();

		System.out.println("Enter the number of columns:");

		int columns=sc.nextInt();

		//initialize the matrices

		int[][]matrix1=new int[rows][columns];

		int[][]matrix2=new int[rows][columns];

		int[][]result=new int[rows][columns];

		//get the values for first matrix

		System.out.println("enter the values for the first matrix");

		for(int i=0;i<rows;i++) {

			for(int j=0;j<columns;j++) {

				matrix1[i][j]=sc.nextInt();
			}

		}

		//get the values for second matrix

		System.out.println("enter the values for the second matrix");

		for(int i=0;i<rows;i++) {

			for(int j=0;j<columns;j++) {

				matrix2[i][j]=sc.nextInt();

			}

		}

		//add the matrices together

		for(int i=0;i<rows;i++) {

			for(int j=0;j<columns;j++) {

				result[i][j]=matrix1[i][j]+matrix2[i][j];

			}

		}

		//print the resulting matrix

		System.out.println("the resulting matrix is:");

		for(int i=0;i<rows;i++) {

			for(int j=0;j<columns;j++) {

				System.out.println(result[i][j] + " ");

			}

			System.out.println();

		}

	}
}