interface withone
{
public String print(String name);
}
public class Lambdawith1.java{
public static void main(String args[])
{
withone w;
w=(name)->
{
return "Hello\t" +name;
};
System.out.println("My Name is:" + w.print("Sarvesh"));
}
}
