package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class Example7Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list=new ArrayList<>();
		
		list.add(new Product(1,"Dell",100f));
		list.add(new Product(2,"Acer",99f));
		list.add(new Product(3,"HP",120f));
		
		System.out.println("Sorting on the basis of name...........");
		
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		for(Product p:list) {
			System.out.println(p.id+" "+p.name+" "+p.price);
		}

	}

}
