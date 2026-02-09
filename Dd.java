import java.util.LinkedList;

class Dd
{
public static void main(String[] args)
{
LinkedList<String> cars = new LinkedList<String>();
cars.add("Tata");
cars.add("Bmw");
cars.add("Volvo");
cars.add("Ford");

// use addfirst to insert at first
cars.addFirst ("Kia");	
System.out.println(cars);
}
}

