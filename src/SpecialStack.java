public class SpecialStack {

	
	int minValue; 
	int maxSize;
	ArrayStack s1 ;
	ArrayStack minStack;
	
	public SpecialStack(int maxSize){
		this.maxSize= maxSize;
		 s1 = new ArrayStack(maxSize);
		 minStack = new ArrayStack(maxSize);	
	}
	
	public void push(int element){
		if(s1.isEmpty()){
			minValue =element;
			minStack.push(minValue);
			s1.push(element);
		}
		
	}
	
	
	
	
	
	
	
	
	
}
