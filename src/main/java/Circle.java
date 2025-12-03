
public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double diameter() {
        return radius * 2;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
