public class RegularOctagon extends AllShape {

    private double length;
    private String name;

    public RegularOctagon(String n, double l) {
        this.name = n;
        this.length = l;
    }

    public double area() {
        return (2 + Math.sqrt(8)) * Math.pow(this.length, 2);
    }

    public String nickname() {
        return this.name;
    }
}
