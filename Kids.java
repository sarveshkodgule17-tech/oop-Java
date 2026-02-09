class Kids {
    int id;
    String name;
    int age;

    Kids(int i, String n)   // Constructor with two parameters
{
        id = i;
        name = n;
    }

    Kids(int i, String n, int a)   // Constructor with three parameters
{
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) 
{
        Kids k1 = new Kids(1111, "Karan", 12);
        Kids k2 = new Kids(1000, "Aryan", 23);

        // Displaying object details
        k1.display();
        k2.display();
    }
}
