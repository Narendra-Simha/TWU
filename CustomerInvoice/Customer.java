package customerinvoice.com;

public class Customer {
	private int id;
	private String name;
	private int discount;
	
	Customer(int id, String name, int discount){
		this.id=id;
		this.name=name;
		this.discount=discount;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getDiscount() {
		return discount;
	}
	
	public void setDiscount(int discount) {
		this.discount=discount;
	}
	
	public String toString() {
	      return name+"("+id+")("+discount + "%)";
	  }
}
