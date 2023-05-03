package LambdaExpression;

@FunctionalInterface
interface M{
	int add(int i,int j);

}
public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M obj=new M() {
			public int add(int i,int j) {
				return i+j;
			
			
			}
		};
	
		
		
//		M obj=(i,j)->i+j;   //lambda expression.
//		
		int result=obj.add(3, 1);
		System.out.println(result);

	}

}
