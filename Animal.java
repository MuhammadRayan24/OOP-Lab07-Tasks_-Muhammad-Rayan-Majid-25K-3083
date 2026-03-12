package Task01;
public class Animal
{
    public void makeSound()
    {
        System.out.println("Animal makes the sound");
    }

    public static void main(String[] args)
    {
        //Runtime polymorphism
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();
        //calling objects
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}

class Dog extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Cow moos");
    }
}
