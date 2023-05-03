package LambdaExpression;


@FunctionalInterface
interface StringsName{
	public String get(String name);
	
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringsName s=(name)->{
			return "Hello," +name;
		};
		System.out.println(s.get("Mani"));
		
		StringsName s1=(name)->{
			return "Mani"+name;
		};
		System.out.println(s1.get("deep"));

	}

}
