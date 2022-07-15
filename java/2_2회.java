    class Ref{
        Ref(int x){
            a=x;
        }
        int sum(Ref obj){
            int k;
            k=obj.a-a;
            return k;
        }
    }
    class PassRef
    {
        public static void main(String[] args)
        {
            Ref obj1=new Ref(3);
            Ref obj2=new Ref(4);
            int k1=obj2.sum(obj1);
            System.out.print("obj1.="+obj1.a);
            System.out.print("obj2.="+obj2.a);
        }
    }