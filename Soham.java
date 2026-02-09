class A {
    void print_A() {
        System.out.println("Class A");
    }
}

class B extends A {
    void print_B() {
        System.out.println("Class B");
    }
}

class C extends A {
    void print_C() {
        System.out.println("Class C");
    }
}

class Soham {
    public static void main(String args[]) {
        B obj_B = new B();  // B is the same class
        obj_B.print_A();
        obj_B.print_B();

        C obj_C = new C();
        obj_C.print_A();
        obj_C.print_C();
    }
}
