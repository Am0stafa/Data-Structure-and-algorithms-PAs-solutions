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
	
	
//	public void cutList(){
//		if (head==null)
//		return;
//
//		//get the size of the list
//		int counter=0;
//		Link curr = head;
//		Link prev = null;
//		while(curr!=null) {
//			counter++;
//			curr= curr.next;
//		}
//		curr= head;
//		
//		
//			for(int i=((counter/2)+1); i<counter; i++) {
//			
//			
//		}
//		
//	
//	
//	
//	}
	
public LinkList merge(LinkList l){
	LinkList o=new LinkList();
	o.head=head;
	Link current=head;
	while(current.next!=null)
	current=current.next;
	current.next=l.head;
	return o;
	}

	
	
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
	
}
