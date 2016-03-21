public class Square extends AllShape {

    private double length;
    private String name;

    public Square(String n, double l) {
        this.name = n;
        this.length = l;
    }

    public double area() {
        return this.length * this.length;
    }

    public String nickname() {
        return this.name;
    }
}
