/**
 * Define and implement class ShapeTest.
 *  This class should implement main(). In the body of the main() method
 *   instantiate an object of Shapes
*/
package com.example;
import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
        ArrayList<Shape> shapeList = new ArrayList<>();
        Shapes shapes = new Shapes(shapeList);

        Shape s1 = new Circle(30);
        Shape s2 = new Circle(10);
        Shape s3 = new Triangle(8, 8, 8);
        Shape s4 = new Triangle(3, 4, 5);
        Shape s5 = new Rectangle(12, 16);
        Shape s6 = new Rectangle(7, 9);
        Shape s7 = new Hexagon(8.5);
        Shape s8 = new Hexagon(16);

        shapeList.add(s1);
        shapeList.add(s2);
        shapeList.add(s3);
        shapeList.add(s4);
        shapeList.add(s5);
        shapeList.add(s6);
        shapeList.add(s7);
        shapeList.add(s8);
        
       

        new Thread() {
    		public void run() {
    		      shapes.compute();
    		   }
    		}.start();

    		new Thread() {
    		public void run() {
    		      shapes.compute();
    		   }
    		}.start();
    	

    		
        // call max() min() to find the biggest and smallest area value.
        shapes.max();
        shapes.min();

    }

	}


