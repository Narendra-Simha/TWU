package pack.com;

public class Book {
	   private String name;
	   private Author[] author;
	   private double price;
	   private int qty;
	   
	   
	   public Book(String name, Author[] author, double price) {  // 1st constructor
	      this.name = name;
	      int n=author.length; //n is size
	      this.author = new Author[n];
	      for(int i=0;i<n;i++) {
	    	  this.author[i]=author[i];
	      }
	  
	      this.price = price;
	   }

	   public Book(String name, Author[] author, double price, int qty) {  // 2nd constructor
	      this.name = name;
	      int n=author.length; //n is size
	      this.author = new Author[n];
	      for(int i=0;i<n;i++) {
	    	  this.author[i]=author[i];
	      }
	      this.price = price;
	      this.qty = qty;
	   }
	   
	   public String getName() {
	     return name; 
	   }

	   public String getAuthor() {
	     return author.toString(); 
	   }

//	   public String getAuthorName() {
//	         return author.getName();  
//	   }
//	   
//	   public String getAuthorEmail() {
//	         return author.getEmail();  
//	   }

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
		  String res="";
		  res="Book[name= "+name+",Author[";
		  int size=author.length;
		  for(int i=0;i<size;i++) {
			  res=res+"[ name= "+author[i].getName()+", email= "+author[i].getEmail()+", gender= "+author[i].getGender() + "]";
			  if(i!=size-1) {
				  res=res+", ";
			  }
			  
		  }
		  res=res+"],price= "+price+", Qty= "+qty+"]";
		  return res;
	      
	   }
}
