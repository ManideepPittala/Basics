package day7;


enum Status1{
	Running,Pending,Failed,Success;
}
public class EnumIfElse {
	public static void main(String[] args) {
		Status1 s=Status1.Pending;
		
		if(s==Status1.Running) {
			System.out.println("All Good");
		}
		else if(s==Status1.Failed) {
			System.out.println("Try Again.");
		}
		else if(s==Status1.Pending) {
			System.out.println("Please wait");
		}
		else {
			System.out.println("Done ");
		}
		
	}

}
