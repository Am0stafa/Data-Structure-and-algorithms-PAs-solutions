public class LinearSortedArray {
	
	public int[] array;
	public int occupied;
	
	public LinearSortedArray(int maxsize) {
		array = new int[maxsize];
		this.occupied =0;
	}
	
	
//	//time complexity O(n)
//	public void orderedInsert(int x) {
//		
//		if(array.length ==  occupied) return;
//		
//		int i ;
//		for( i =occupied; i>0; i--) {
//			
//			if(array[i-1]>x) 
//				array[i]=array[i-1];
//			
//			else {
//				array[i]=x;
//				occupied++;
//			}
//
//		}
//		
//	}
	
	         //ANOTHER WAY
	//time complexity O(n)
//	public void orderedInsert(int x) {
//		
//		if(array.length ==  occupied) return;
//		
//		int insertposition =0;
//		
//		while(insertposition > occupied && array[insertposition]< x)
//			insertposition++;
//		
//		for(int i = occupied; i<insertposition; i--) 
//			array[i] =array[i-1]; 
//			
//		array[insertposition] = x;
//		occupied++;
//	}
	
                //ANOTHER WAY
	// an alternative recursive method for insertion into sorted array
	//time complexity O(n)
	
	public void orderedInsert(int x) {
		
		if(occupied == array.length)
			return;
		
		else
			helper(x , occupied);
		
		
	}
	public void helper(int x, int occ) {
		
		if(occ > 0 && array[occ - 1] > x) {
			array[occ]=array[occ-1];
			
			helper(x, occ-1);
		}
		else {
			array[occ]=x;
			occupied++;
			return;
		}
	}
	
	//time complexity O(log(n))
	public int binarySearchIter(int x) {
		
		int lower = 0;
		int upper = array.length-1;
		int mid;
		
		while(lower<=upper) {
			mid = (lower+upper)/2;
			//OR
			//mid = (upper - lower)/2 + lower
			
			if(array[mid]==x)
				return mid;
			
			else if(array[mid]<x)
				lower= mid+1;
			else
				upper = mid-1;
		}	
		return -1;
	}
	
	//time complexity O(log(n))
	public int binarySearchRec(int x) {
		
	return	helperbinary( 0 , array.length -1, x);
		
	}
	
	public int helperbinary( int lower , int upper, int x) {
		
		if(lower<=upper) {
			
			int mid = (lower+upper)/2;
			if(array[mid]<x)
				helperbinary( mid+1, upper, x);
			if(array[mid]>x)
				helperbinary( lower, mid-1, x);
			if(array[mid]==x)
				return mid;
		}
		
			return -1;
	
		
		
		
		
	}
	//time complexity O(n)
	public void delete(int x) {
		int pos = this.binarySearchIter(x);
		
		if(pos == -1) return;
	
		                //<occupied-1 as binarry search return start from 0....
		for(int i = pos; i<occupied-1; i++) {
			array[i]=array[i+1];
			
		}
		
		this.occupied--;	
	}
	
	public void displayArray()
	{
	// print the array
	System.out.print("Sorted Array: ");
	for(int i = 0; i < occupied; i++)
	{
	System.out.print(array[i] + " ");
	}
	System.out.println();
	}
	
	
	

	
}

