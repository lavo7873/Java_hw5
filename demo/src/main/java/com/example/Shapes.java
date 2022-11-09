/**
 * @author vuaivantrinhsjgmail.com
 * HW 5
 * Exercise 1
 * Define and implement class Shapes. 
 * This class should have a private ArrayList attribute Named shapeList. 
 * implement a getter and a setter for shapeList
 * using methods add() and remove()
 * synchronized public method called compute()
 *  in which you iterate through the 
 *  members of shapeList 
 * 
 */

import java.util.ArrayList;

public class Shapes {
	
    private ArrayList<Shape> shapeList;     


	public Shapes() {
	}
		// TODO Auto-generated constructor stub


    public Shapes(ArrayList<Shape> list) {
        this.shapeList = list;
    }	
	


	public ArrayList<Shape> getShapeList() {
		return shapeList;
	}


	public void setShapeList(ArrayList<Shape> shapeList) {
		this.shapeList = shapeList;
	}
	 public void add(Shape e) {
	        shapeList.add(e);
	    }

	    public void remove(Shape e) {
	        shapeList.remove(e);
	    }
	    
	 

	    synchronized public void compute() {
	        for (Shape e : shapeList) {
	            System.out.printf("Shape %s, area %5.2f\n", e.getShapeName(), e.computeArea());
	        }
	    }
	    public void max() {
	        Shape maxShape = new Shape();
	        double maxArea = shapeList.get(0).computeArea();
	        for (Shape s : shapeList) {
	            if (s.computeArea() > maxArea) {
	                maxArea = s.computeArea();
	                maxShape = s;
	            }
	        }
	        System.out.println("--The Maximum Area--\n" + maxShape.toString() + "Max area = " + maxArea);
	    }

	    public void min() {
	        Shape minShape = new Shape();
	        double minArea = shapeList.get(0).computeArea();
	        for (Shape s : shapeList) {
	            if (s.computeArea() < minArea) {
	                minArea = s.computeArea();
	                minShape = s;
	            }
	        }
	        System.out.println("--The Minimim Area:--\n" + minShape.toString() + "Min area " + minArea);
	    }
	}