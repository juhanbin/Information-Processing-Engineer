public class main
{
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
    }
}