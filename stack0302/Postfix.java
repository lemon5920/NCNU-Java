public class Postfix {

    public static int eval(String[] ops) {
        Stack s = new Stack();
        for(int i = 0; i < ops.length; i++) {
            if(ops[i].equals("+")) {
                s.push(s.pop() + s.pop());
            }else if(ops[i].equals("*")) {
                s.push(s.pop() * s.pop());
            }else {
                s.push(Integer.parseInt(ops[i]));
            }
        }
        return s.pop();
    }

    public static void main(String[] argv) {
        String[] expression = new String[] {"1", "3", "5", "*", "+"};
        System.out.println(Postfix.eval(expression));
    }

}
