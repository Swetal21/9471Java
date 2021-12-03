class Animal
{void eat()
{
System.out.println("Eating");
}
}
class Dog extends Animal{
void bark()
{
System.out.println("Barking");
}
}
class Cat extends Animal{
void Meow()
{
System.out.println("Meowing");
}
}
class Inheritance2
{
public static void main(String args[])
{
Cat c= new Cat();
c.Meow();
c.eat();
}}