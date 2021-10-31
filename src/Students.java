
public class Students {

	String firstName;
	String lastName;
	int id;
	
	public Students(String firstName, String lastName, int id) {
		this.firstName= firstName;
		this.lastName = lastName;
		this.id= id;
		
	}
	@Override
	public String toString(){
	return firstName+" "+lastName+", ID: "+id;
	}
	
}
