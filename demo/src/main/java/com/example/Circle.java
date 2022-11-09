
public class Circle extends Shape   {
    private double radius;
    final private double PI = 3.14;



    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    synchronized public double computeArea() {
        return radius * PI;
    }

    public String toString() {
        return super.toString() + "\nRadius = " + radius + ".\n";
    }

}
