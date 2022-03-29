import java.util.function.Function;

class Student{
	
	String name ;
	int marks ;
	Student (String name,int marks){
		
		this.name = name ;
		this.marks=marks;
	}
}
public class FunctionFIExample {

	public static void main(String[] args) {
		 Function<Student , String> f =s->{
			 
			 int marks =s.marks;
			 String grade ="";
			 if(marks >=80) grade="A";
			 else if (marks >65) grade ="B";
			 else if (marks >55) grade ="C";
			 else if (marks >45) grade ="D";
			 else if (marks <25) grade ="fail";
			 return grade;
		 };
		 
		 Student [] s = {new Student ("ravi",80 ),new Student ("kavi",65),new Student ("sabi",55)};
		 
		 for (Student s1:s) {
			 
			 System.out.println(f.apply(s1));
			 
		 }

}
}
