class testFinallyBlock2
{
public static void main (String[] args)
{
try
{
System.out.println("inside try Block");
int data = 25/0;
System.out.println(data);
}
catch(ArthemeticException e)
{
System.out.println("Exception handled");
System.out.println(e);
}
finally
{
System.out.println("finally block is always excuted");
}
System.out.println("rest of the code");
}
}
