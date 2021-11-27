package CWH;

class MyString {
    String str;
    MyString(String str)
    {
        this.str=str;
    }
}
public class Test{
    public static void main(String[] args) {
        System.out.println(new StringBuilder("GLA"));
        System.out.println(new MyString("GLA"));
    }
}
