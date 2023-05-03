package LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=new ArrayList<>();
		s.add("Mani");
		s.add("Asha");
		s.add("vara");
		s.add("kanna");
		
		
		s.forEach(
				(n)->System.out.println(n)
				
		);

	}

}
