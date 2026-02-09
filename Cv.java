import java.util.ArrayList;
class Cv
{
public static void main(String[] args)
{
ArrayList<String> cars = new ArrayList<String>();
cars.add("Volvo");
cars.add("BMW");
cars.add("Ford");
cars.add("Tata");
cars.set(0,"Kia");
System.out.println(cars.get(0));
}
}
