package round.com;

public class TestMain {
	
	public static void main(String[] args) {
		Circle circle1= new Circle(4.5,"Red");
		Cylinder c=new Cylinder(circle1,18);
		System.out.print(c);
		
	}
}
