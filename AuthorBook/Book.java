package abook.com;

public class Book {
	 private String name;
	   private Author author;
	   private double price;
	   private int qty;
	   
	   
	   public Book(String name, Author author, double price) {  // 1st constructor
	      this.name = name;
	      this.author = author;
	      this.price = price;
	   }

	   public Book(String name, Author author, double price, int qty) {  // 2nd constructor
	      this.name = name;
	      this.author = author;
	      this.price = price;
	      this.qty = qty;
	   }
	   
	   public String getName() {
	     return name; 
	   }

	   public String getAuthor() {
	     return author.toString(); 
	   }

	   public String getAuthorName() {
	         return author.getName();  
	   }
	   
	   public String getAuthorEmail() {
	         return author.getEmail();  
	   }

	  public void setPrice(double price) {
	    this.price = price; 
	  }

	   public void setQty(int qty) {
	      this.qty = qty; 
	  }

	   public double getPrice() {
	    return price; 
	  }

	   public int getQty() {
	    return qty; 
	  }


	   public String toString() {
	      return "Book[name= " + name +", Author[name=" + author.getName()+ ", email=" + author.getEmail() + ", gender=" + author.getGender() + "], price= "+price+", Qty= "+qty+"]";
	   }
}
