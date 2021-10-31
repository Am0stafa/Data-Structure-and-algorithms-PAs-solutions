public class LinearArray {
	public int[] array;
	public int occupied;
	
	public LinearArray(int arraySize) {
		this.occupied = 0;
		array =new int[arraySize];
		
	}
	
	//time complexity O(1)
	public void insertLast(int x) {
		if (occupied == array.length) return;
		if(occupied < array.length) {
			array[occupied] =x;
			occupied+=1;
		}
		
	}
	
	//time complexity O(n)
	public void insertFirst(int x) {
		if(occupied == array.length) return;
		
		if(occupied < array.length) {
			for(int i = occupied;i < 0; i++ ) {
				array[i]= array[i-1];
				
			}
			
		}
		array[0]=x;
		occupied+=1;
			
		
	}
	
	//time complexity O(n)
	public int linearSearch(int x) {
		
		for(int i =0; i<occupied; i++) {
			if (array[0]== x) return i;
		}
		
		
		return -1;	
	}
	
	//time complexity O(n)
	public void delete(int x) {
		int pos = this.linearSearch(x);
		
		if(pos == -1) return;
	
		
		for(int i = pos; i<occupied; i++) {
			array[i]=array[i+1];
			
		}
		
		this.occupied--;	
	}
	
	public void displayArray()
	{
	// print the array
	System.out.print("Array: ");
	for(int i = 0; i < occupied; i++)
	System.out.print(array[i] + " ");
	System.out.println();
	}
	
	
	
	
	
	
}
