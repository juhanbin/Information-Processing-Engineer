public class main
{
    public static void main(String[]args)
    {
        int a=10;
        int b=2;
        try
        {
            System.out.println("Start");
            System.out.println("결과값은"+(a/b));
            System.out.println("End");
        }
        catch(ArithmeticException e)
        {
            System.out.println("산술오류 발생");
        }
        catch(Exception e)
        {
            System.out.println("오류발생");
        }
        finally     //예외를 만나든 말든 수행
        {
            System.out.println("프로그램 종료");
        }
    }
}