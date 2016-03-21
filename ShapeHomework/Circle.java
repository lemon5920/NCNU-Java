public class Circle extends AllShape {

    private double radius;
    private String name;
    private final double pi = 3.14159265359;

    public Circle(String n, double r) {
        this.name = n;
        this.radius = r;
    }

    public double area() {
        return Math.pow(this.radius, 2) * this.pi;
    }

    public String nickname() {
        return this.name;
    }
}
