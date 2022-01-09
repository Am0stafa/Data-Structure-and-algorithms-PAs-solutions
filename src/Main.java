import java.util.HashSet;

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
		
		
//		LinearSortedArray b = new LinearSortedArray(10);
//		b.orderedInsert(5);
//		b.orderedInsert(3);
//		b.orderedInsert(1);
//		b.orderedInsert(44);
//		b.displayArray();
//		System.out.println("Iteratively 5 at: " + b.binarySearchIter(5));
//		System.out.println("Recursively 6 at: " + b.binarySearchRec(6));
//		System.out.println("Recursively 5 at: " + b.binarySearchRec(5));
//		
//		Stack<Integer> thestack = new Stack<Integer>();
		
		
//		
//		QueueObj q = new QueueObj(10);
//		q.enqueue(1);
//		q.enqueue(2);
//		q.enqueue(2);
//		q.enqueue(3);
//		q.enqueue(4);
//		q.enqueue(5);
//		q.enqueue(5);
//		reverse(q).printQueue();

//		QueueObj q = new QueueObj(5);
//		q.enqueue(new Integer(1));
//		q.enqueue(new Integer(8));
//		q.enqueue(new Integer(15));
//		q.enqueue(new Integer(7));
//		q.enqueue(new Integer(2));
//		q.printQueue();
//		QueueObj mirrorQ = mirror(q);
//		mirrorQ.printQueue();
		
//		
//		int[] intArray = {2,5,46,12,40,3,4,7,9};
//		
//		System.out.println(Arrays.toString(intArray));
//		bogoSort(intArray);
//		System.out.println(Arrays.toString(intArray));

		
//		ArrayStack s = new ArrayStack(10);
//		s.push(4);
//		s.push(20);
//		s.push(7);
//		s.push(1);
//	
//		s.printStack();
//		System.out.println(12+": internally "+ s.search(12)+", externally: "+ searchFor(s, 12));
//		System.out.println(1+": internally "+ s.search(1)+", externally: "+ searchFor(s, 1));
//		System.out.println(20+": internally "+ s.search(20)+", externally: "+ searchFor(s, 20));
		
//		
//		String expr0 = "8 4 /";
//
//		System.out.println(expr0.charAt(2));
//	
//		String expr1 = "123*+4+";
//		System.out.println(expr1+" = "+ evaluate2(expr1));
		
		
		//System.out.println(getPeriority('*'));
		
//		ArrayStack s = new ArrayStack(4);
//		s.push(1);
//		s.push(4);
//		s.push(3);
//		s.push(2);
//		s.printStack();
//		Insertionsort(s);
//		s.printStack();;

		
		
		
		
//		
//		BrowsingHistory browsingHistory = new BrowsingHistory ();
//		browsingHistory . add (" https :// www . google1 . com /" );
//		browsingHistory . add (" http :// www . youtube . com /" );
//		browsingHistory . add (" https :// www . google . com /" );
//		System . out . println (" Currect ␣ browsing  history :" );
//		browsingHistory . printHistory ();
//		//System . out . println (" Most ␣ viewed ␣ so ␣ far ␣ is ␣" + browsingHistory . search ());
//		browsingHistory . removeLast (" 2014 -10 -07 " );
//		System . out . println (" Currect ␣ browsing ␣ history :" );
//		browsingHistory . printHistory ();
//		browsingHistory . add (" http :// www . facebook . com / " );
//		browsingHistory . add (" http :// www . youtube . com /" );
//		browsingHistory . add (" https :// www . google . com /" );
//		browsingHistory . add (" http :// met . guc . edu . eg /" );
//		browsingHistory . add (" http :// www . youtube . com /" );
//		browsingHistory . add (" http :// met . guc . edu . eg /" );
//		browsingHistory . add (" http :// met . guc . edu . eg /" );
//		System . out . println (" Currect ␣ browsing ␣ history :" );
//		browsingHistory . printHistory ();
//		System . out . println (" Most ␣ viewed ␣ so ␣ far ␣ is ␣" + browsingHistory . search ());
//		browsingHistory . removeLast ();
//		browsingHistory . removeLast ();
//		System . out . println (" Currect ␣ browsing ␣ history :" );
//		browsingHistory . printHistory ();
//		System . out . println (" Most ␣ viewed ␣ so ␣ far ␣ is ␣" + browsingHistory . search ());
		
//		LinkList a = new LinkList();
//		a.insertLast(1);
//		a.insertLast(2);
//		a.insertLast(3);
//		a.insertLast(5);
//		a.insertLast(6);
//		a.insertLast(7);
//
//		a.insertatN(4, 4);
//
//		System.out.println (a);
//
//		LinkList b = new LinkList();
//
//		b.insertFirst(5);
//		b.insertFirst(6);
//		b.insertFirst(7);
	int array[] = {1,2,3,4,5,6,7,8,9,10};
		BTree a = new BTree();
		a =	a.idealTopology(array);
		System.out.println(a.numOfLeaves());

//		HashSet<Integer> a = new HashSet<Integer>();
//		a.add(1);
//		a.add(2);
//		a.add(2);
//		a.add(3);
//		a.add(2);
//		System.out.println(a);
//

	}
	

//
//public static void frontBackSplit(LinkList list) {
//	int count = 0;
//	LinkList temp = new LinkList();
//	while (!list.isEmpty()) {
//	temp.insertLast(list.removeFirst());
//	count++;
//	}
//	LinkList subList1 = new LinkList();
//	LinkList subList2 = new LinkList();
//
//	if(count%2 == 0){
//		for(int i=0; i<count/2; i++)
//			subList1.insertLast(temp.removeFirst());
//
//		for(int i=count/2; i<count-1; i++)
//			subList2.insertLast(temp.removeFirst());
//	}
//
//	else {
//		for(int i=0; i<count/2; i++)
//			subList1.insertLast(list.removeFirst());
//
//		for(int i=count/2; i<count; i++)
//			subList2.insertLast(list.removeFirst());
//	}
//
//
//
//	System.out.print("First sublist:");
//	System.out.print(subList1.toString()+" ");
//	System.out.print("Second sublist: ");
//	System.out.print(subList2.toString()+" ");
//
//
//	//remove every thing put it back to the list
//
//
//}
	
//public static LinkList mix(LinkList x) {
//	LinkList temp = new LinkList();
//		Object a;
//		Object b;
//	while(!x.isEmpty()) {
//	a = x.removeFirst();
//		if(!x.isEmpty()) {
//			b=x.removeLast();
//		temp.insertLast(b);
//		temp.insertLast(a);
//		
//		}else
//			temp.insertLast(a);
//		
//	}
//	return temp;
//	
//}
	
	
//	public static LinkList reverse1(LinkList list) {
//		LinkList temp = new LinkList();
//		while(!list.isEmpty())
//			temp.insertFirst(temp.removeLast());
//		
//		return temp;
//	}
	
//	public static LinkList removedup(LinkList list) {
//		LinkList temp = new LinkList();
//	
//	temp.insertLast(list.removeFirst());
//	
//	
//	 while(!list.isEmpty()){
//	
//		if(list.getFirst().equals(temp.getLast())) 
//			list.removeFirst();
//		else
//			temp.insertLast(list.removeFirst()); 
//	 						}
//		
//		
//		return temp;
//	}
	
	
//	public static QueueObj reverse(QueueObj a) {
//		
//		StackObj rev = new StackObj(a.size()+1);
//		
//		while(!a.isEmpty())
//			rev.push(a.dequeue());
//		
//		
//		while(!rev.isEmpty())
//			a.enqueue(rev.pop());
//		
//		return a;
//
//		
//	}
																					
//	public static QueueObj ReverseRecursion(QueueObj q) {
//		if (q.isEmpty())
//		return q;
//		Object data = q.dequeue();
//		q = ReverseRecursion(q);
//		q.enqueue(data);
//		return q;
//		}
//
//	
//	public static QueueObj mirror(QueueObj q) {
//		
//		QueueObj result = new QueueObj(q.size()*2);
//		QueueObj reversed = new QueueObj(q.size());
//		
//		
//		reversed = ReverseRecursion(q);
//		
//		while(!reversed.isEmpty()) {
//			result.enqueue(reversed.dequeue());
//		}
//		
//		while(!q.isEmpty()) {
//			result.enqueue(q.dequeue());
//		}
//		
//		return result;
//		
//		
//		
//	}
	
//	public static void bubbleSort(int array[]) {
//		
//		//boolean isSorted =true;
//		int temp;
//		for(int i=0; i<array.length-1; i++) {
//			
//			for(int j =0; j<array.length-1-i; j++) {
//				if(array[j]>array[j+1]) {
//				//	isSorted= false;
//					temp= array[j];
//					array[j]=array[j+1];
//					array[j+1]=temp;
//					
//				}
//				//if(isSorted) return;
//			}
//			
//		}
//		
//	}
//	
//	
//	public static void selectionSort(int array[]) {
//		
//		int tempIndex, temp;
//		
//		for(int i=0; i<array.length-1; i++) {
//			tempIndex= i;
//			for(int j=i+1; j<array.length; j++){
//				if(array[tempIndex]>array[j]) {
//					tempIndex =j;
//					
//				}
//				temp = array[i];
//				array[i]= array[tempIndex];
//				array[tempIndex]=temp;
//				
//			}
//				
//		}
//	
//	}
//	
//	public static void insertionSort(int array[]){
//		
//		int key, j; 
//		
//		for(int i=1; i<array.length;i++) {
//				
//			key= array[i];
//			
//			j= i-1;
//			
//			
//			while(array[j]>key && j>=0) {
//				
//				array[j+1]=array[j];
//				--j;
//				
//			}
//			
//			array[j+1]= key;
//		}
//		
//		
//		
//	}
//	
//	public static void suffle(int array[]){
//		int random,temp;
//		
//		for(int i =0; i<array.length; i++) {
//			random = (int) (Math.random()*(array.length-i))+i;
//		//	System.out.println(random);
//			temp=array[i];
//			array[i]=array[random];
//			array[random]=temp;
//			
//		}
//	}
//	
//	public static boolean isSorted(int array[]){
//		
//		int counter=0;
//		
//		for(int i =0; i<array.length-1; i++) {
//			if(array[i]<array[i+1]) {
//				counter++;
//				
//			}
//			
//		}
//		
//		if(counter==array.length-1)
//			return true;
//		
//		return false;
//	}
//	
//	public static void bogoSort(int array[]){
//		int counter=0;
//
//		while(!isSorted(array)) {
//			counter++;
//			suffle(array);
//		}
//		
//		System.out.println(counter);
//		
//	}
//	
//	public static int searchFor(ArrayStack s1, int target) {
//		
//		ArrayStack s2 = new ArrayStack(s1.size());
//		
//		int counter=0;
//		
//		while(!s1.isEmpty()) {
//			
//			if(s1.top() == target) 			
//				return counter;
//			
//			
//			
//			s2.push(s1.pop());
//			counter++;
//		}
//		
//		
//		while(!s2.isEmpty())
//			s1.push(s2.pop());
//		
//		return -1;
//	}

//	postfix or prefic evaluation
//public static int evaluate2(String expretion) {
//	
//	StackObj s1 = new StackObj(expretion.length());
//	
//	int firstnum;
//	int secondnum;
//	int result;
//	
//	for(int i=0; i<expretion.length(); i++) {
//		
//		if(Character.isDigit(expretion.charAt(i))) {
//			
//			s1.push(Integer.parseInt(expretion, expretion.charAt(i)));
//		}
//		else {
//			
//			secondnum = ((Integer) s1.pop()).intValue();
//			firstnum = ((Integer)s1.pop()).intValue();
//			
//			switch(expretion.charAt(i)) {
//			
//			case'+':
//				s1.push((firstnum+secondnum));
//				break;			
//			case'-':
//				s1.push((firstnum-secondnum));
//				break;
//				
//			case'*':
//				s1.push((firstnum*secondnum));
//				break;
//				
//			case'/':
//				s1.push((firstnum/secondnum));
//				break;
//				
//			}
//			
//			
//		}
//		
//		
//		
//	}
//	
//	result = ((Integer) s1.pop()).intValue();
//	
//	return result;
//}
	
	// infix to postfix or prefix

//	
//public static String infixToPostfix(String expretion){
//	
//	String result ="";
//		StackObj s1 = new StackObj(50) ;
//		
//	for(int i=0 ; i<expretion.length(); i++){
//		
//		if(expretion.charAt(i) >='0' ||expretion.charAt(i) <='9' ){
//			
//			result+=expretion.charAt(i);
//		}
//		else{
//			if(s1.isEmpty())
//				s1.push(expretion.charAt(i));
//			
//			else if(getPeriority(expretion.charAt(i)) > getPeriority((char)s1.top()))
//				s1.push(expretion.charAt(i));
//			
//			else if(getPeriority(expretion.charAt(i)) <= getPeriority((char)s1.top())) {
//				
//				while(getPeriority(expretion.charAt(i)) <= getPeriority((char)s1.top())) {
//					
//					result+= (char)s1.pop();
//					
//				}
//				
//			}
//			
//			else if(expretion.charAt(i)=='(') 
//				s1.push(expretion.charAt(i));
//
//				
//			else if(expretion.charAt(i)==')'){
//				while((char)s1.top()!='(') {
//					result+= (char)s1.pop();					
//				}
//			}		
//		}
//		
//		
//	}
//	
//	
//	while(!s1.isEmpty()) {
//		result+=(char) s1.pop();
//		
//		
//		
//	}
//	
//	
//	return result;
//	
//}
//	
//	
//public static int getPeriority(char a){
//	
//	
//	int result=0;
//	
//	switch(a){
//	
//	case '+' :
//		
//	case '-' :
//		result= 1;
//		break;
//	case '*':
//	case'/':
//		result = 2;
//		break;
//	case'^':
//		result = 3; 
//		break;
//
//	
//	}
//	
//	return result;
//	
//}
	
	
//	public static void Selectionsort(ArrayStack s1){
////		ArrayStack sorted = new ArrayStack(s1.size());
//		ArrayStack temp = new ArrayStack(s1.size());
//			int maxNum;
//		
//		
//			for(int i=0; i<s1.size();i++){
//				maxNum =s1.pop();
//				
//				while(!s1.isEmpty()){
//					if(s1.top() > maxNum) {
//						temp.push(maxNum);
//						maxNum = s1.pop();
//					}
//					else 
//						temp.push(s1.pop());
//			   }
//				s1.push(maxNum);
//				
//				while(!temp.isEmpty()) 
//					s1.push(temp.pop());
//	
//			}
//		
//	
//		
//		
//		
//		//return s1;
//	}
//	
//	
	
//	public static void Insertionsort(ArrayStack s1){
//		ArrayStack temp = new ArrayStack(s1.size());
//
//			while(!s1.isEmpty()) {
//
//				if(temp.isEmpty()) {
//					temp.push(s1.pop());
//				}
//				
//				while(!temp.isEmpty() &&s1.top() > temp.top()) 
//					temp.push(s1.pop());
//				
//		
//					s1.push(temp.pop());
//
//			}
//			
//			while(!temp.isEmpty()) 
//				s1.push(temp.pop());
// }	

	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
