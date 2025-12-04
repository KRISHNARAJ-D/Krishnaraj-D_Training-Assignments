package oops;
abstract class AbstractClass 
{
    abstract void display(); 
}
class Child extends AbstractClass 
{
    void display() 
    {
        System.out.println("Hello from Child Class");
    }
}

public class AbstractClassDemo
{
    public static void main(String[] args) 
    {
        AbstractClass obj = new Child(); 
        obj.display();
    }
}