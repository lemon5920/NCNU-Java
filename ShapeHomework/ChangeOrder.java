public class ChangeOrder extends AllShape {

    private double area;
    private String nickname;

    public ChangeOrder(String s, double d) {
        this.area = d;
        this.nickname = s;
    }

    public double area() {
        return this.area;
    }

    public String nickname() {
        return this.nickname;
    }
}
