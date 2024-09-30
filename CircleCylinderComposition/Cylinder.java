package round.com;

import java.lang.classfile.Superclass;

public class Cylinder {
	   private Circle base; 
	   private double height;
	   
	   public Cylinder() {
		      base = new Circle(); 
		      height = 1.0; 
		}
	   
	   public Cylinder(Circle base,double height) {
		      this.base=base;
		      //this.base.setRadius(radius);
		      this.height=height;
		}
	   
	   public Circle getBase() {
		  return base;
	   }


		public void setBase(Circle base) {
			this.base = base;
		}
	
	
		public double getHeight() {
			return height;
		}
		
		
		public void setHeight(double height) {
			this.height = height;
		}
	   
		public String toString() {
		      return "Cylinder[Circle[Radius= " + base.getRadius() +", Color=" + base.getColor()+ "], Height= "+height+" ]";
		   }
}
