package LambdaExpression;


@FunctionalInterface
interface Sayable{
	public String say();
	
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sayable s=()->{
			return "Lambda expression";
		};
		System.out.println(s.say());

	}

}
