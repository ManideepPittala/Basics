package day7;


enum Laptop1{
	Macbook(2000),XPS(2200),Surface,ThinkPad(1800);
	
	
	private int price;
	

	private Laptop1() {
		price=500;
	}

	private Laptop1(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Laptop1 lap=Laptop1.Macbook;
		for(Laptop1 lap:Laptop1.values())
		System.out.println(lap +":"+lap.getPrice());

	}

}
