
interface MyInterface {
    double getValue();
}

public class LambdaExp1 {
    public static void main(String[] args) {
        MyInterface ref; // Declare reference to MyInterface
        ref = () -> 3.14; // Lambda expression to return 3.14
        System.out.println("Value of pi: " + ref.getValue());
    }
}
