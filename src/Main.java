
public class Main {

	public static void main(String[] args) {

		
//		LinearArray a = new LinearArray(10);
//		a.insertLast(3);
//		a.insertLast(7);
//		a.insertFirst(8);
//		a.displayArray();
//		System.out.println("Count: " + a.occupied);
//		System.out.println("Position of 8: " + a.linearSearch(8));
//		System.out.println("Position of 5: " + a.linearSearch(5));
//		a.delete(33);
//		a.delete(3);
//		System.out.println("Count: " + a.occupied);
		
		
//		LinearArrayStudents a = new LinearArrayStudents(10);
//		a.insert(new Students("Timmy", "Turner", 1));
//		a.insert(new Students("Harry", "Potter", 2));
//		a.insert(new Students("Peter", "Parker", 3));
//		a.insert(new Students("Jack", "Sparrow", 4));
//		a.displayArray();
//		System.out.println("Count: " + a.occupied);
//		System.out.println("Position of Harry: " + a.linearSearchObj(new Students("Harry", "Potter", 2)));
//		a.delete(new Students("Hermione", "Granger", 5));
//		a.delete(new Students("Harry", "Potter", 2));
//		System.out.println("Count: " + a.occupied);
//		a.displayArray();
//		System.out.println("Position of Harry: " + a.linearSearchObj(new Students("Harry", "Potter", 2)));
		
		
		LinearSortedArray b = new LinearSortedArray(10);
		b.orderedInsert(5);
		b.orderedInsert(3);
		b.orderedInsert(1);
		b.orderedInsert(44);
		b.displayArray();
		System.out.println("Iteratively 5 at: " + b.binarySearchIter(5));
		System.out.println("Recursively 6 at: " + b.binarySearchRec(6));
		System.out.println("Recursively 5 at: " + b.binarySearchRec(5));
		
		
		
		
	}

}
