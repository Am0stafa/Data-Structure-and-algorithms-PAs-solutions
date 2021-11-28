public class priorityQueueInt {

	int maxSize;
	int array[];
	int index;
	
	public priorityQueueInt(int maxSize) {
		
		this.maxSize =maxSize;
		array = new int[maxSize];
		 index =-1;
	}
	
	
	
	public void insert(int element) {
		int i;
		if(index>0) {
			array[index] = element;
			index++;
		}else{
			for(i = index; i>0; i++)
				if(array[i]>element)
					array[i+1]=array[i];
					
			array[i+1]=element;
	
			
		}
	}
	
	public int pop() {
		
		if(!(index==-1))
		return array[index];
		
		return -1;
	}
	
	
}
