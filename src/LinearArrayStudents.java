
public class LinearArrayStudents {
	public Students[] array;
	public int occupied;
	
	
	public LinearArrayStudents(int arraySize) {
		occupied = 0;
		array =new Students[arraySize];
		
	}
	
	public void insert(Students x) {
		if (occupied == array.length) return;
		if(occupied < array.length) {
			array[occupied] =x;
			occupied+=1;
		}
		
	}
	public int linearSearchObj(Students x)
	{
	for(int i = 0; i < array.length; i++)
	if(array[i]!= null && array[i].id == x.id)//order is crucial and must use && not just &
	return i;
	return -1;
	}
	
	public void delete(Students x) {
		int pos = this.linearSearchObj(x);
		
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
	for(int i = 0; i < array.length; i++)
	if(array[i]!=null)
	System.out.print(array[i] + " ");
	System.out.println();
	}
	
}
