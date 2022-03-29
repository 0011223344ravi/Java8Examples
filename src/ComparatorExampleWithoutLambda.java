import java.util.*;

class MyComparator implements Comparator <Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		 if(o1<o2) 
		 {
            return -1;
		 }
            else if(o1>o2) {
        	return 1;
        }
        else 
        	{
        	
        return 0;
        	}
        	
        	}
	
	
	
}
public class ComparatorExampleWithoutLambda {
	
	

	public static void main(String[] args) {
		 
		ArrayList<Integer> l = new ArrayList<>();
		l.add(25);
		l.add(5);
		l.add(10);
		l.add(20);
		l.add(15);
		System.out.println(l);
		Collections.sort(l,new MyComparator());
		System.out.println(l);
	}

}
