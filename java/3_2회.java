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
        class Child extends Parent{
            String name;
            int age;
            int height;
            public void set_name(String param_n){
                super.name=param_n+"엄마";
                this.name=param_n;           
            }
            public void set_age(int param_i){
                super.set_age(param_i+24);
                age=param_i;
            }
        }
        public static void main(String[]args){
            Child c=new child();
            c.set_name("길동이");
            c.set_age(40);

            System.out.print(c.name);
            System.out.print(c.age);
        }