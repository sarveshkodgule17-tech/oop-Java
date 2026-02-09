class Sum
{
 public int sum( int x, int y)      // sum() with two int paramertres
{
return(x+y);
}

public int sum( int x, int y, int z)         // Sum() with three paramerters
{
 return(x+y+z);
}

public double sum( double x, double y)      // sum() with different data types and two paramertres
{
 return(x+y);
}
public static void main(String args[])
{
 Sum s= new Sum();
System.out.println(s.sum(10,20));
System.out.println(s.sum(10,20,30));
System.out.println(s.sum(30.5,40.5));
}
}
