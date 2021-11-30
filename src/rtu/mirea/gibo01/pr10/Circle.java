package rtu.mirea.gibo01.pr10;

public class Circle extends Shape {
    private int radius;

    @Override
    public double getArea() {
        double s;
        s = this.getRadius() * this.getRadius() * Math.PI;
        s = Math.pow(this.getRadius(),2) * Math.PI;
        return s;
    }

    @Override
    public  double getPerimetr() {
        return (2 * Math.PI * this.getRadius());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public int getRadius() {
        return radius;
    }

    public Circle(String color, boolean filled, int radius) {
        super(color, filled);
        this.radius = radius;
    }
}