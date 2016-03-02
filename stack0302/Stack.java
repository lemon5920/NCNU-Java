public class Stack {

    int top = 0; // object variable
    int [] data = new int[100]; // object variable

    public Stack(){
    }

    public void push(int x){
        // x is a local variable, and a parameter
        data[top++] = x;
    }

    public int pop() {
        return data[--top];
    }

}
