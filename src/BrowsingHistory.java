public class BrowsingHistory {

	int counter; 
	StackObj history;
	StackObj temp;
	
	
	public BrowsingHistory(){
		history  = new StackObj(1000); 
		temp  = new StackObj(1000); 
		counter=0;
	}
	
	public void add(String url){
		counter++;
		history.push(url);
	}
	public void removeLast(){
		counter--;
		history.pop();
	}
	public void removeLast(String date) {
		
		Links l= null ;

		while(!history.isEmpty()){
			l= ( Links ) history . pop ();
			if (! l.date.equals ( date )){
				temp.push(l);
				
			}
			
		}
		
		while(!temp.isEmpty()){
			history.push(temp.pop());
		}
		
	}
	
	public int getNumberOfLinks() {
		
		return counter;
		
	}
	
	
	public String search (){
		String max_so_far = "";
		int max_frequency =0;
		Links l= null ;
		while (! history . isEmpty ()){
		l= ( Links ) history . pop ();
		if (l. frequency > max_frequency ){
		max_frequency =l. frequency ;
		max_so_far =l. url ;
		}
		temp . push (l );
		}
		while (! temp . isEmpty ()){
		history . push ( temp . pop ());
		}
		return max_so_far ;
		}
	
	
	public void printHistory (){
		history . printStack ();
		}

	

	
	
	
	
}
