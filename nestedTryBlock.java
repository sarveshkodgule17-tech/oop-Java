class nestedTryBlock
{
public static void main (String[] args)
{
try
{
try
{
System.out.println("going to divide by 0");
int b=39/0;
}
 catch(Arithemetic Exception e)
{
System.out.println(e);
}
try
{
int a []=new int [5];
a[5]=4;
}
catch(ArrayIndexOutOfBounds Exception e)
{
System.out.println(e);
}
System.out.println("other statements");
}
catch(Exception e)
{
System.out.println("handled expection(outer catch)");
}
System.out.println("Normal flow:);
}
}
