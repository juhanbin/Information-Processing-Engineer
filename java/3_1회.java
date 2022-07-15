// tip: each public class is put in its own file
public class main
{
    
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        class Parent{
            String name;
            int age;
            public void set_name(String param_n){
                name=param_n;
            }
            public void set_age(int param_i){
                age=param_i;
            }
        }
        class Child extends parent{
            int height;
            public void set_height(int apram_h){
                height=param_h;
            }
        }
        public static void main(String[] args){
            Child c=new Child();
            c.set_name("홍길동");
            c.set_age(40);
            c.set_height(170);
        }
        System.out.print(c.name);
        System.out.print(c.age);
        System.out.print(c.height);
    }
}