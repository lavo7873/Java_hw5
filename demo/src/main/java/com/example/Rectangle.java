/**
 * 
 * @author vuaivantrinhsjgmail.com
 * HW5
 * Exercise 1 
 * Design and implement a class hierarchy to represent the following 2-D shapes:
 * triangle, circle, rectangle, and hexagon.
 * all these s shapes are descendants
 * each class needs to have getters and setters defined and 
 * implemented for all the attributes. Each leaf shape class (triangle, circle, rectangle, hexagon) 
 * should have computeArea() method implemented.
 */
public class Rectangle extends Shape {
	private double width;
    private double length;
    
    Rectangle(double width, double length) {
        super("Rectangle");
        this.setWidth(width);
        this.setLength(length);
    }

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	 public double computeArea() {
	        return width * length;
	    }

	    public String toString() {
	        return super.toString() +
	                "\nWidth=" + width + "\nlength=" + length + ".\n";
	    }
	    

}
