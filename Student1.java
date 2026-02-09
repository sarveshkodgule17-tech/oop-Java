class Student1 
{
    int rollno;     
    String name;
    float fee;

    // Parameterized constructor
    Student1(int rollno, String name, float fee) 
{
        this.rollno = rollno;  // THIS KEYWORD
        this.name = name; 
        this.fee = fee;
    }

    void display() 
{
        System.out.println(rollno + " " + name + " " + fee);
    }

    public static void main(String args[]) 
{        
        Student1 s1 = new Student1(2310025, "Anish", 40000f);
        Student1 s2 = new Student1(230030, "Aryan", 50000f);
        s1.display();
        s2.display();
    }
}
