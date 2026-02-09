abstract class Bike  // abstract class
{
 abstract void run(); // abstract method
}
class Honda4 extends Bike
{
void run() // normal methpd
{
System.out.println("running");
}

public static void run(String[] args)
{
 Bike obj = new Honda4();
obj.run();
}
}



