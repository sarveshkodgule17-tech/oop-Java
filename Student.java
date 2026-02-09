class Student {
    int id;
    String name;

    // Parameterized constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Student s1 = new Student(1111, "Karan");
        Student s2 = new Student(1001, "Anish");

        s1.display();
        s2.display();
    }
}
