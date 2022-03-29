
@FunctionalInterface
interface ABC{
	
	 public void m1();
	 
} 
public class LambdaExpression   {
	
	
 
	public static void main(String[] args) {
	
		ABC i = ()->System.out.println("lambda");
		i.m1();
	}

	 

}
