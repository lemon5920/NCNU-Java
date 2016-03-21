public class ChangePerson extends AllData {
    
    private String name;
    private int age;

    public ChangePerson(String s, int i) {
        this.name = s;
        this.age = i;
    }

    public String name() {
        return this.name;
    }

    public int age() {
        return this.age;
    }
}
