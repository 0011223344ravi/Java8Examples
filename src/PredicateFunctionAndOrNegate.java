import java.util.function.Predicate;
public class PredicateFunctionAndOrNegate {

	public static void main(String[] args) {
		 int arr[]= {5,10,15,20,25,30};
			Predicate<Integer> p1 = i->i%2==0;
		    Predicate<Integer> p2 =i->i>10;
		    System.out.println("and  implementation");   
		    for (Integer i :arr) {
		    	 if(p1.and(p2).test(i)) {
		    		 System.out.println(i);
		    		 
		    	 }
		    	
		    }
        System.out.println("Or implementation");
		    for (Integer i :arr) {
		    	 if(p1.or(p2).test(i)) {
		    		 System.out.println(i);
		    		 
		    	 }
		    	
		    }
		    
		    System.out.println("Negate");
		    for (Integer i :arr) {
		    	 if(p2.negate().test(i)) {
		    		 System.out.println(i);
		    		 
		    	 }
		    	
		    }

}
}
