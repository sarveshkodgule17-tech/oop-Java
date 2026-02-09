class Outerclass {
    int x = 10;

    class Innerclass {
        int y = 5;
    }
}

public class Saru {
    public static void main(String[] args) {
        Outerclass myOuter = new Outerclass();
        Outerclass.Innerclass myInner = myOuter.new Innerclass();
        System.out.println(myInner.y + myOuter.x);
    }
}
