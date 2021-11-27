package p1;
//with outer class we can't create private,protected
abstract public class Person
{
    public int age;
    public String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
