import java.util.ArrayList;
import java.util.Collections;

class Employee{
	int eid ;
	String name ;
	Employee(int eid , String name ){
		this.eid=eid;
		this.name = name ;
		
	}
	
	public String toString() {
		return eid+":"+name ;
	}
	
}
public class ComparableExampleLambda {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(15454,"ravi"));
		l.add(new Employee(15646,"kavi"));
		l.add(new Employee(11125,"sabi"));
		 
		System.out.println(l);
		Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(l);

	}

}
