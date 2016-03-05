import java.math.BigInteger;
public class StackInt {

    int top = 0; // object variable
    BigInteger[] data = new BigInteger[100]; // object variable

    public StackInt(){
    }

    public void push(BigInteger x){
        // x is a local variable, and a parameter
        this.data[top++] = x;
    }

    public BigInteger pop() {
        return this.data[--top];
    }

}
