package LambdaExpression;

@FunctionalInterface
interface calling{
	String say(String message);
}
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calling c=(message)->{
			String s1="I don't like Biryani,";
			String s2=s1+message;
			return s2;
			
		};
		System.out.println(c.say("But Biryani like me."));

	}

}
