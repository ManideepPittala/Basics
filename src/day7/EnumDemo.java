package day7;


enum Status{
	Running,
	Failed,
	Pending,Success; //named Constraints by not using any int r string.
}
public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		//Status s=Status.Running;
		//System.out.println(s);
		//System.out.println(s.ordinal());//ordinal gives the sequence value 
		Status[] ss=Status.values();
		for(Status s:ss) {
			System.out.println(s+" : "+s.ordinal());
		}

	}

}
