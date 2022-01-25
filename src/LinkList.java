import java.util.LinkedList;

class Link {
	public Object data;
	public Link next;

	public Link(Object o) {
		this.data = o;
		this.next = null; //the next is automatically made null 
	}

	public String toString() {
		return data.toString();
	}
}

class LinkList {
	private Link head;

	public LinkList() {
		head = null;
	}

	public void insertFirst(Object o) {
		Link newLink = new Link(o);
		newLink.next = head;
		head = newLink;
	}

	public Object removeFirst() {
		Object res = head.data;
		head = head.next;
		return res;
	}

	public Object getFirst() {
		return head.data;
	}

	public void insertLast(Object o) {
		Link newLink = new Link(o);
		if (head == null) {
			head = newLink;
			return;
		}
		Link current = head;
		while (current.next != null)
			current = current.next;
		current.next = newLink;
	}

	public Object removeLast() {
		if (head.next == null) {
			Object res = head.data;
			head = null;
			return res;
		}
		Link current = head;
		while (current.next.next != null)
			current = current.next;
		Object res = current.next.data;
		current.next = null;
		return res;
	}

	public Object getLast() {
		Link current = head;
		while (current.next != null)
			current = current.next;
		return current.data;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public String toString() {
		if (head == null)
			return "[ ]";
		String res = "[ " + head.data;
		Link current = head.next;
		while (current != null) {
			res += ", " + current.data;
			current = current.next;
		}
		res += " ]";
		return res;
	}
	
	
	
	public void Revese(){
		Link prev,curr ,ncurr;
		prev=null;
		curr=head;
		ncurr=head;
		while(curr!=null){
			ncurr=ncurr.next;
			curr.next=prev;
			//zo2 wa7d
			prev=curr;
			curr=ncurr;
		}
		head=prev;
		
		
		
	}
	
	public void cutList(){
		if (head==null)
		return;

		//get the size of the list
		int counter=0;
		Link curr = head;
		Link prev = null;
		while(curr.next!=null) {
			counter++;
			curr= curr.next;
		}
		System.out.println(head.data);
		System.out.println(curr.data);


	}
	
public LinkList merge(LinkList l){
	LinkList o=new LinkList();
	o.head=head;
	Link current=head;
	while(current.next!=null)
	current=current.next;

	current.next=l.head;
	return o;
	}

	
	//O(n)
	public void insertatN(int pos , Object data ) {
		int poss =pos-2;
		Link ncurr, curr;
		Link newlink  = new Link(data);
		if(pos==1) {
			newlink.next = head;
			head = newlink;
	
		}
		else{
			
			curr=head;
			ncurr=head;
			while(poss>-1){
				curr=ncurr;
				ncurr = curr.next;
				poss--;
			}
			
			curr.next = newlink;
			newlink.next = ncurr;	
			
		}
		
		
	}

//getting the middle value of a linklist without using a couter by making to pointer a and b and b moves twice as
// fast as be
// at the end b will be pointing to a location twice as far from a
	public Link getmid(){
		Link a = head;
		Link b = head;

		while(b.next != null || b.next.next !=null){
			a = a.next;
			b = b.next.next;
		}


		return a;

	}
	//Mafe4 7aga esmaha .next w 7ot
//bn7arak dayman el so8ayar 3l4n ywsal lel keber
	public LinkList union(LinkList l) {
		Link a = head;
		Link b = l.head;
		LinkList o = new LinkList();
	int i=0;
		while (a != null && b != null) {
			if ((int) a.data > (int) b.data) {
					o.insertLast(b);
					b = b.next;
			} else if ((int) a.data < (int) b.data) {
				o.insertLast(a);
				a = a.next;
			} else {
				o.insertLast(a);
				a = a.next;
				b = b.next;
			}
		 //in case we finished one early like in case [10,20,30] [1,2,3]
		if(a!=null){
			while (a!=null){
				o.insertLast(a);
				a= a.next;
			}

		}
			if(b!=null){
				while (b!=null){
					o.insertLast(b);
					b= b.next;
				}

			}

		}
		return o;
	}
	//must be sorted
	public void removeDup(){
		Link current = head;
		Link ncurrent = head.next;
		 while (current != null && ncurrent != null){
		 	if(current.data!=ncurrent.data) {

		 		current.next = ncurrent;
		 		current = ncurrent;
			}
			 ncurrent = ncurrent.next;
		 }

	}

//detecting a loop just like finding the middle value we will make two pointers one move by one step and other move
// by two steps(twice as fast) until they both meet which means we found a duplicate or they both are pointing to
// same node which mean there is a loop

	public boolean detectLoop(){
		Link b;
		Link a = b = head;

		while (b.next !=null  && b.next.next!= null){
			b = b.next.next;
			a = a.next;
			if(a.data == b.data)
				return true;


		}
			return false;

	}

//1)slow pointer fast pointer technique to get the middle value
//2)set the middle .next as second half
//3)loop from the head and second half until the second half != null
//4)check if the head.data != second half.data return false else contine moving both the head and the second half

	public boolean firstEqualSecond(){
		Link a = head;
		Link b = head;
		Link secondHalf;
		Link first =head;

		while(b.next!=null && b.next.next != null){
			a=a.next;
			b= b.next.next;
		}
		//as a will be standing exactly in the middle pos
		secondHalf = a.next;

		while(secondHalf != null){
			if(first.data!=secondHalf.data)
				return false;
			secondHalf = secondHalf.next;
			first = first.next;


		}
		return true;
	}


	public LinkList addTwoList(LinkList l2){
		//first reverse both since it isnt doubly
		this.Revese();
		l2.Revese();
		Link p1 = head;
		Link p2 = l2.head;
		int carry=0;
		int sum =0;
		LinkList result = new LinkList();
		while(p1!=null || p2!=null){
			//DONT FORGET IF NULL
			sum = carry+(p1 != null ? (int)p1.data: 0) +(p2 != null ? (int)p2.data: 0);
			carry = sum/10;
			result.insertLast(sum%10);
			if(p1 != null)
				p1 = p1.next;
			if(p2!= null)
				p2 = p2.next;

		}
		if(carry != 0)
			result.insertLast(carry);

		result.Revese();
		return result;
	}




	
}
