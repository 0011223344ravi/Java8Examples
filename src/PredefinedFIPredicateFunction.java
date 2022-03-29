import java.util.ArrayList;
import java.util.function.Predicate;

class Emp{
	
	int eid ;
	String Name ;
	Emp(int eid, String name) {
		 
		this.eid = eid;
		this.Name = name;
	}
	
	
}

public class PredefinedFIPredicateFunction {
	

			
			public static void main(String[] args) {
		 
				ArrayList<Emp> al = new ArrayList<Emp>();
				al.add(new Emp(1, "ravi"));
				al.add(new Emp(2,"kavi"));
				al.add(new Emp(3, "baba"));
				al.add(new Emp(4,"dhaba"));
				
				
				Predicate<Emp> p = e->e.eid>1;
				for (Emp e : al) {
					
					if(p.test(e))
						System.out.println(""+e.eid+" :->"+e.Name);
					
					
					
				}
				
	}

}
