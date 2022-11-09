
public class Hexagon extends Shape {

		private double sideLength;
		
		   public Hexagon(double sideLength) {
		        super("Hexagon");
		        this.sideLength = sideLength;
		    }

		    public double getSide() {
		        return sideLength;
		    }

		    public void setSide(double sideLength) {
		        this.sideLength = sideLength;
		    }

		    @Override
		    synchronized public double computeArea() {
		        return (3 * Math.sqrt(3)  * Math.pow(sideLength, 2)) / 2;
		    }

		    @Override
		    public String toString() {
		        return super.toString() +  "\nSide length = " + sideLength+ ".\n" ;
		    }
		
		

}
