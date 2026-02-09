class Animal 
{
    void eat() 
{
        System.out.println("eating");
    }
}

class Dog extends Animal
 {                                      // new Dog class
    void walk() 
{
        System.out.println("Walking");
    }
}

class Test 
{                                              // New class
    public static void main(String args[]) 
{
        Dog d = new Dog();
        d.eat();
        d.walk();
    }
}
