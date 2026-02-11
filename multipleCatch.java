class multipleCatch
{
public static void main (String[] args)
{
try
{
int a[]= new int[5];
a[5]=30/0;
}
catch(ArithematicException e)
{
System.out.println("Arithematic Exception Occurs");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(" Array Index Out Of Bounds Exception occurs");
}
catch(Exception e)
{
System.out.println(" Parent Exception Occurs");
}
System.out.println("Rest of the code");
}
}
