class Animal
{
  void eat()
{
 System.out.println("eating");
}
}

class Dog extends Animal
{
  void bark()
{
 System.out.println("barking");
}
}
class BabyDog extends Dog
{
  void weep()
{
 System.out.println("Weeping");
}
}

  class Anish 
{
 public static void main(String args[])
{
  BabyDog d =new BabyDog(); // object crete last multi level
   d.eat();
   d.bark();
   d.eat();
}
}

  