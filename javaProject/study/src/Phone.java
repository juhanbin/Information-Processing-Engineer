public class Phone {
    String name;      //이름속성
    int age;             //나이속성
    String color;     //색상속성

    public void print() {    //메서드
        System.out.println(name);
        System.out.println(age);
        System.out.println(color);

    }

    public Phone(){

    }
    public Phone(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Phone(String name, int age){
        this.name = name;
        this.age = age;
    }


}
