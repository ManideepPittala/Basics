package day7;

enum Status2{
	Running,Pending,Failed,Success;
}
public class EnumSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Status2 s=Status2.Running;
		switch(s)
		{
		case Running:
			System.out.println("All Good");
			break;
		case Pending:
			System.out.println("Please Wait");
			break;
		case Failed:
			System.out.println("Try Again");
			break;
		default:
			System.out.println("Done");//we cannot extend the enum.
			break;
		}
		

	}

}
