package com.example;
public class Shape {
	
	private String shapeName;
	

    public Shape() {
    }
	
	Shape(String shapeName){
		this.shapeName = shapeName;
		
	}

	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	synchronized public double computeArea() {
		return 0;
	}
	
	public String toString(){
		return "Shape: " + shapeName ;
}
}