package p1;
class one
{
    public int num1=90;
//can we use super inside the method->no
}
class two extends one{
    public int num1=67;
    public void display()
    {
        System.out.println(num1);
        System.out.println(super.num1);
    }
}
public class Test34
{
    public static void main(String[] args)
    {
        two obj=new two();
        //obj.display();
        System.out.println(obj.num1);
        //System.out.println(super.num1);
    }
}
