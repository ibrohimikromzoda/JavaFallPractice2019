package B_exercise_replits;

public class Carpet {
	
	//do not change -- Start
	  public double width,length,unitPrice,totalPrice;
	  public boolean isPersian;
	 //do not change -- End
	 
	 //Add constructors below
	  
	  
	  
	  public Carpet () {
		 this.width =20;
		 this.length= 20;
		 this.unitPrice = 2;
		 this.totalPrice = 200;
		 this.isPersian = false;
	  }
	  
	  public Carpet (double with, double length, double unitPrice, double totalPrice, boolean isPersian) {
		  this.width = width;
		  this.length=length;
		  this.unitPrice=unitPrice;
		  this.totalPrice=totalPrice;
		  this.totalPrice = (width+length)*unitPrice;
	  
	  
	  if (isPersian) {
		  this.totalPrice +=200;
		 
	  }
	  }

}


