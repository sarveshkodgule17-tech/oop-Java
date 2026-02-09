interface MyInterface
{
public void myMethod(); // interface method
}
interface SecondInterface
{
public void myOtherMethod(); // interface method
}
class Democlass implements MyInterface , SecondInterface
{
public void myMethod()
{
System.out.println("Some text");
}
public void myOtherMethod()
{
System.out.println("Some other text");
}
}
class Cj
{
public static void main(String[] args)
{
Democlass obj = new Democlass();
obj.myMethod();
obj.myOtherMethod();
}
}

