package LambdaExpression;

@FunctionalInterface
interface Adding{
	int add(int i,int j);
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Adding a=(i,j)->i+j;
		int result=a.add(3, 1);
		System.out.println(result);
	}
	

}
