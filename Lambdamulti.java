interface MyInterface
{
public double add(int a,int b);
}
public class LambdawithMulti {
public static void main(String args[])
{
MyInterface p;
p=(a,b)->(a+b);
System.out.println("Addition of a,b:"+p.add(20,5));
}
}
