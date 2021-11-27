package p1;
//Shadowing
//constructor ko between classes use krne ke lie super
//super must be in first line
//can't use inside the methode
public class Emp extends Person{
    int eid;
    int sal;
    public Emp(int eid,int sal,int age,String name)
    {
        super(age,name);
        this.eid=eid;
        this.sal=sal;

    }

}
