interface ShapeInterface {
    // interface 中的變數一定為 final，即使省略，編譯時也會加進去。
    public static final double PI = 3.1415926536;
    public abstract double area();
}

interface SubShape extends ShapeInterface {
}

interface Strange {
    double PI = 3.0;
    int var1 = 10;
    void fun();
}

interface Multi extends SubShape, Strange {
    void fun();
}

interface Second {
}

public class TestInterface implements Multi, Second {
    public void fun() {
        System.out.println("TestInterface use print to implement to Multi, Second.");
    }
    public double area() {
        return ShapeInterface.PI;
    }
    public static void main(String[] argv) {
        TestInterface t = new TestInterface();
        System.out.println(t.area());
    }
}
