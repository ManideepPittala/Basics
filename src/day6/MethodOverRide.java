package day6;
class Calcu
{
	public int add(int n1,int n2) {
		return n1+n2;
	}
}
class AdvCalcu extends Calcu{
	public int add(int n1,int n2,int n3) {
		return n1+n2+n3;
	}
}
public class MethodOverRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvCalcu obj=new AdvCalcu();
		int r1=obj.add(3, 4, 5);
		System.out.println(r1);

	}

}
