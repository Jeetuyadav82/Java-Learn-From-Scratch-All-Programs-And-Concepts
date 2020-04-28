import java.util.*;
public class function_calling_simple {
    public static void main(String args[])
    {

        Scanner n =new Scanner(System.in);

        int a=5;
        int b=6;
        int p;
        p=To_sum(a,b);
        System.out.println(p);

    }

    static int To_sum(int a, int b)
    {
        return a+b;
    }

}
