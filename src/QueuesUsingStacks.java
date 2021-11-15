public class QueuesUsingStacks {

	StackObj stack1;
	StackObj stack2;
	int counter;
	int maxSize;
	
	public QueuesUsingStacks(int maxSize){
		stack1= new StackObj(maxSize);
		stack2= new StackObj(maxSize*2);
		 counter=0;
		this.maxSize=maxSize;

	}
	
	public boolean isEmpty(){
		return (counter==0);
	}
	public boolean isFull() {
		
		return (counter==maxSize);	
	}
	
	public void enqueue(Object element) {
		if(isEmpty()) {
			stack1.push(element);
			counter++;
			return;
		}
		if(isFull()) {
			return;	
		}
		
		while(!stack1.isEmpty()) 
			stack2.push(stack1.pop());
		
			
		stack1.push(element);
		
		
		while(!stack2.isEmpty())
			stack1.push(stack2.pop());
		
		counter++;
					
	}
	
	public Object dequeue(){
		
		if(isEmpty()) 
			return null;
		
		
		int poped = (int) stack1.pop();
		return poped;
		
		
	}
	
	
	
	
	
	
}
