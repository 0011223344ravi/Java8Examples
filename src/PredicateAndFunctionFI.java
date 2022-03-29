import java.util.function.*;

class Std{
	
	String name ;
	int marks ;
	Std (String name,int marks){
		
		this.name = name ;
		this.marks=marks;
	}
}

public class PredicateAndFunctionFI {

	public static void main(String[] args) {
		
		    Predicate<Std> p =s->s.marks>60;
			 Function<Std , String> f =s->{
				 
				 int marks =s.marks;
				 String grade ="";
				 if(marks >=80) grade="A";
				 else if (marks >65) grade ="B";
				 else if (marks >55) grade ="C";
				 else if (marks >45) grade ="D";
				 else if (marks <25) grade ="fail";
				 return grade;
			 };
			 
			
			 Std [] s = {new Std ("ravi",80 ),new Std ("kavi",65),new Std ("sabi",55)};
			 
			 for (Std s1:s) {
				 if( p.test(s1)) {
				
				  System.out.print("Name :-"+s1.name); 
				  System.out.print("Marks :-"+s1.marks);
				 System.out.println("Grade :-"+f.apply(s1));
				 }
			 }

	}

	}


