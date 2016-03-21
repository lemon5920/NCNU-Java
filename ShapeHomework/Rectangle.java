public class Rectangle extends AllShape {

    private double length, width;
    private String name;

    public Rectangle(String n, double l, double w) {
        this.name = n;
        this.length = l;
        this.width = w;
    }

    public double area() {
        return this.length * this.width;
    }

    public String nickname() {
        return this.name;
    }
}
