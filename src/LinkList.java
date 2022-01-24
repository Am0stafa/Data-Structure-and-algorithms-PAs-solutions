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

	public Object getmid(){
		Link a = head;
		Link b = head.next;

		while(b != null || b.next !=null){
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






	
}
