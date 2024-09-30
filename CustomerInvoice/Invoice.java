package customerinvoice.com;

public class Invoice {
	private int id;
	private Customer customer;
	private double amount;
	
	Invoice(int id,Customer customer,double amount){
		this.id=id;
		this.customer=customer;
		this.amount=amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getCustomerName() {
		return customer.getName();
	}
	public int getCustomerId() {
		return customer.getId();
	}
	
	public int getCustomerDiscount() {
		return customer.getDiscount();
	}
	public double getAmountAfterDiscount() {
		double AmountAfterDiscount=amount-(amount*customer.getDiscount())/100;
		return AmountAfterDiscount;
	}
	public String toString() {
	      return "Invoice[id= " + id +", Customer=" + customer.getName()+ "("+customer.getId()+")(" +customer.getDiscount()+"%), amount= "+amount +"]";
	   }
}
