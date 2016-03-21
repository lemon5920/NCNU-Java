public class Trapezoid extends AllShape {

    private double up, down, height;
    private String name;

    public Trapezoid(String n, double u, double d, double h) {
        this.name = n;
        this.up = u;
        this.down = d;
        this.height = h;
    }

    public double area() {
        return (this.up + this.down) * this.height / 2;
    }

    public String nickname() {
        return this.name;
    }
}
