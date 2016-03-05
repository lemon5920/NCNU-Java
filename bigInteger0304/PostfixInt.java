import java.math.BigInteger;
public class PostfixInt {

    public static BigInteger eval(String[] ops) {
        StackInt s = new StackInt();
        for(int i = 0; i < ops.length; i++) {
            if(ops[i].equals("+")) {
                s.push(s.pop().add(s.pop()));
            }else if(ops[i].equals("*")) {
                s.push(s.pop().multiply(s.pop()));
            }else if(ops[i].equals("-")) {
                s.push(s.pop().subtract(s.pop()));
            }else if(ops[i].equals("/")) {
                s.push(s.pop().divide(s.pop()));
            }else if(ops[i].equals("^")) {
                s.push(s.pop().pow(s.pop().intValue()));
            }else {
                s.push(new BigInteger(ops[i]));
            }
        }
        return s.pop();
    }

    public static void main(String[] argv) {
        String[] expression = new String[] {"3", "2", "^"};
        System.out.println(PostfixInt.eval(expression).toString());
    }

}
