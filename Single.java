class A {
    int a, b;

    void display() {
        System.out.println("Inside class A values = " + a + " " + b);
    }
}

class B extends A {
    int c;

    void show() {
        System.out.println("Inside class B values = " + a + " " + b + " " + c);
    }
}

class Single {
    public static void main(String args[]) {
        B obj = new B(); // Corrected object creation
        obj.a = 10;
        obj.b = 20;
        obj.c = 30;
        obj.display(); // Calling display method from class A
        obj.show();    // Calling show method from class B
    }
}


