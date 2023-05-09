package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputByBuffer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number:");
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(in);
		
		int num=Integer.parseInt(bf.readLine());
		System.out.println(num);
		
		
		System.out.println("Enter a String :");
		String s=bf.readLine();
		System.out.println(s);
		
		
		
		bf.close();  //because bufferreader is source then its our responsibility to stop/close it....

	}

}
