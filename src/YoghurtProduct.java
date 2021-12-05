import java.util.Date;

@SuppressWarnings("rawtypes")
public class YoghurtProduct implements Comparable {
	public int id;
	public double originalPrice;
	public Date expiryDate;
	
	
	public YoghurtProduct(int price, int id, Date expiryDate) {
		
		this.originalPrice = price;
		this.id = id;
		this.expiryDate = expiryDate;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

		
		
	
		
	
	
}
 