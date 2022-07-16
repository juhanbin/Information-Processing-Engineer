public class Main {

    public static void main(String[] args){
        Phone Phone1 = new Phone("주판빈", 22, "red");//객체 생성

        System.out.println(Phone1.name);//이름출력
        System.out.println(Phone1.age);//나이출력
        System.out.println(Phone1.color);//색상출력

        Phone1.print();//메서드를 활용한 출드

        Phone1.color="black";//Phone1객체의 색상을 검정색으로 바꿈
        System.out.println(Phone1.color);//바뀐 Phone1의색을 출력
    }
}

