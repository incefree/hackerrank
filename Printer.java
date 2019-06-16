package hackerrank;
// generics
public class Printer {
 <T> void printArray(T[] array) {
	 for (T element : array) {
		System.out.println(element);
	}
 }
}
