import java.util.HashMap;

class Lmb
{
public static void main(String[] args)
{
HashMap<String,String> capitalCities = new HashMap<String,String>();
capitalCities.put("India", "Delhi");
capitalCities.put("America", "New York");
capitalCities.put("England", "London");
capitalCities.put("Italy", "Roma");
System.out.println(capitalCities.get("England"));
}
}

