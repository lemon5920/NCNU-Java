import java.util.Scanner;
public class ShapeHomework {
    public static void main(String[] argv) {

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();

        AllShape[] as = new AllShape[amount];

        for(int i = 0 ; i < amount ; i++) {
            String Shape = input.next();

            switch( Shape ) {
                case "Circle":
                    as[i] = new Circle(input.next(), input.nextFloat());
                    break;
                case "Rectangle":
                    as[i] = new Rectangle(input.next(), input.nextFloat(), input.nextFloat());
                    break;
                case "Square":
                    as[i] = new Square(input.next(), input.nextFloat());
                    break;
                case "Triangle":
                    as[i] = new Triangle(input.next(), input.nextFloat(), input.nextFloat());
                    break;
                case "RegularOctagon":
                    as[i] = new RegularOctagon(input.next(), input.nextFloat());
                    break;
                case "Trapezoid":
                    as[i] = new Trapezoid(input.next(), input.nextFloat(), input.nextFloat(), input.nextFloat());
                    break;
                default:
                    System.out.println("error, input again.");
                    i--;
                    continue;
            }

        }

        System.out.println();
        ShapeCommand.sort(as);
        ShapeCommand.printData(as);
        System.out.println();
        System.out.println(ShapeCommand.sum(as));
    }
}
