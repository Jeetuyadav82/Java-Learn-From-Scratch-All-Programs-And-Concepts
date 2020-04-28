import java.util.*;

class deff extends mul
{
    int sub(int x,int y)
    {
        return x-y;
    }
}


class mul
{
    int mult(int x,int y)
    {
        return x*y;
    }
}

public class function_calling_outside_from_class {

    static void add(int x, int y)
    {
        System.out.println(x+y);
    }

    static int div(int x,int y)
    {
        return x/y;
    }


    public static void main(String[] args)
    {

        Scanner n=new Scanner(System.in);

        add(10,20);


        int r=div(10,2);
        System.out.println(r);


        deff d=new deff();
        int q=d.sub(10,5);
        System.out.println(q);


        int s=d.mult(10,20);
        System.out.println(s);


    }

}
