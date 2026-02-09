class Employee 
{
    float salary = 40000; // Default salary for Employee
}

class Programmer extends Employee 
{
    int bonus = 10000; // Bonus specific to Programmer
 
public static void main(String[] args) 
{
        Programmer p = new Programmer();
        System.out.println("Salary of Employee is: " + p.salary);
        System.out.println("Bonus of Employee is: " + p.bonus);
    }
}

