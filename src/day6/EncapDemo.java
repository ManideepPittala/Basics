package day6;
class Human{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class EncapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj=new Human();
		obj.setAge(22);
		obj.setName("Manideep");
		
		System.out.println(obj.getAge()+":"+obj.getName());

	}

}
