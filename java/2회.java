public class Person
{
    String name;
    int age;         //멤버변수 두개생성

    public Person()
    {
        this.name="사람";
        this.age=1;         //멤버변수 두개생성
    }
    public Person(String name,int age)
    {
        this.name="name";
        this.age=age;         //멤버변수 두개생성
    }
    public void toPrint()
    {
        System.out.println(this.name+"님의 나이는"+this.age+"살 입니다.");
    }
}
public static void main(String[]args)
{
    Person p1=new Person();
    p1.toPrint();

    Person p2=new Person("이흥직",40);
    p2.toPrint();
}