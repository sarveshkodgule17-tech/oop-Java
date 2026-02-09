interface Plants
{
 public void animalsound(); // method who do not have body
 public void sleeping(); // method who not have body
}

class Dog implements Plants
{
public void animalsound()
{
System.out.println(" Yes this is DOG");
}
public void sleeping()
{
System.out.println(" Dog is sleeping");
}
}

class Lol
{
public static void main(String[] args)
{
Dog mydog = new Dog();
mydog.animalsound();
mydog.sleeping();
}
}
