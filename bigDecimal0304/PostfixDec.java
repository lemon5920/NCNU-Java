import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Vector;
public class PostfixDec {

    public static BigDecimal eval(String[] ops) {
        StackDec s = new StackDec();
        for(int i = 0; i < ops.length; i++) {
            if(ops[i].equals("+")) {
                s.push(s.pop().add(s.pop()));
            }else if(ops[i].equals("*")) {
                s.push(s.pop().multiply(s.pop()));
            }else if(ops[i].equals("-")) {
                s.push(s.pop().subtract(s.pop()));
            }else if(ops[i].equals("/")) {
                s.push(s.pop().divide(s.pop(), 5, BigDecimal.ROUND_HALF_UP));
            }else if(ops[i].equals("^")) {
                // int op2 = s.pop().intValue();
                s.push(s.pop().pow(s.pop().intValue()));
            }else {
                s.push(new BigDecimal(ops[i]));
            }
        }
        return s.pop();
    }

    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        Vector<String> v = new Vector<String>();
        while (input.hasNext()) {
            v.add(input.next());
        }
        String[] exp = new String[v.size()];
        v.copyInto(exp);
        System.out.println(PostfixDec.eval(exp).toString());
    }

}
