package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Java8 {

	public static void main(String[] args) {

		
		 List<String> stringCollection = new ArrayList<>();
		 
		 stringCollection.add("aaa3");
		 stringCollection.add("bbb5");
		 stringCollection.add("ccc");
		 stringCollection.add("asdf");
		 
		 stringCollection.forEach(System.out::println);
		 
		 stringCollection.stream()
		 .filter(s->s.contains("b"))
		 .forEach(System.out::println);
	}

}
