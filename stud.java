class College {
    public void move() {
        System.out.println("College is Open");
    }
}

class Univ extends College {
    public void move() {
        System.out.println("University is also open too");
    }
}

class Stud {
    public static void main(String[] args) {
        College a = new College(); // College object
        College b = new Univ();    // Polymorphic reference to Univ object

        a.move(); // Calls College's move method
        b.move(); // Calls Univ's move method (dynamic method dispatch)
    }
}
