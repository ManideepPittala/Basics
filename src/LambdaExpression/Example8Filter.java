package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Phone{
	int id;
	String name;
	float price;
	public Phone(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}
public class Example8Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Phone> list=new ArrayList<>();
		list.add(new Phone(1,"OnePlus",30000f));
		list.add(new Phone(2,"Mi",23000f));
		list.add(new Phone(3,"Samsung",50000f));
		list.add(new Phone(4,"IPhone",80000f));
		list.add(new Phone(5,"Realme",19000f));
		
		Stream<Phone> fil=list.stream().filter(p->p.price>20000);
		
		fil.forEach(
				phone->System.out.println(phone.name+":"+phone.price));
		
		
	

	}

}
