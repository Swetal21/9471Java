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

class BabyDog extends Dog{
void cry()
{
System.out.println("Crying");
}
}
class Inheritance1
{
public static void main(String args[])
{
BabyDog d= new BabyDog();
d.cry();
d.bark();
d.eat();
}}