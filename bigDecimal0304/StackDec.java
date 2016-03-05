import java.math.BigDecimal;
public class StackDec {

    int top = 0; // object variable
    BigDecimal[] data = new BigDecimal[100]; // object variable

    public StackDec(){
    }

    public void push(BigDecimal x){
        // x is a local variable, and a parameter
        this.data[top++] = x;
    }

    public BigDecimal pop() {
        return this.data[--top];
    }

}
