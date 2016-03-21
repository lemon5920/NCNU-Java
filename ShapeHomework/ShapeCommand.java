public class ShapeCommand {

    public void ShapeCommand() {

    }

    public static void sort(AllShape[] as) {
        for (int i = as.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (as[j].area() > as[j + 1].area()) {

                    double swp_area1 = as[j].area();
                    String swp_name1 = as[j].nickname();

                    double swp_area2 = as[j + 1].area();
                    String swp_name2 = as[j + 1].nickname();

                    as[j] = new ChangeOrder(swp_name2, swp_area2);
                    as[j + 1] = new ChangeOrder(swp_name1, swp_area1);

                }
            }
        }
    }

    public static double sum(AllShape[] as) {
        double total = 0;
        for (int i = 0 ; i < as.length ; i++) {
            total += as[i].area();
        }
        return total;
    }

    public static void printData(AllShape[] as) {
        for(int i = 0 ; i < as.length ; i++) {
            System.out.println(as[i].nickname() + " " + as[i].area());
        }
    }

}
