public class method_overloading {
    public static void main(String args[])
    {
        System.out.println(Add(10,20));
        System.out.println(Add(10.50,20.56));
        System.out.println(Add("Jeetu ","Yadav"));

    }

    public static int Add(int a, int b)
    {
        return (a+b);
    }

    public static double Add(double a, double b)
    {
        return (a+b);
    }

    public static String Add(String a, String b)
    {
        return (a+b);
    }
}
