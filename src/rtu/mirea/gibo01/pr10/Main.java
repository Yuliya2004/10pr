package rtu.mirea.gibo01.pr10;

public class Main {
    public static void main(String[] args) {
        Circle a = new Circle("yellow", true, 2);
        System.out.println(a);
        System.out.println("Периметр равен " + a.getPerimetr());
        System.out.println("Площадь равна " + a.getArea());
        Rectangle b = new Rectangle("orange",true,14,43);
        Shape c = new Rectangle("red",true,23,22);
        System.out.println("Периметр равен " + b.getPerimetr());
        System.out.println("Площадь равна " + b.getArea());
        System.out.println(c.getPerimetr());
    }
}
