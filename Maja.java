interface Printable
{
void print(); // Interface
}

class A4 implements Printable
{
 public void print()
{
System.out.println("Hello");
}
}

class Maja
{
public static void main(String[] args)
{
A4 obj= new A4();
obj.print();
}
}
