import java.util.*;
public class simple_string_operations {
    public static void main(String args[])
    {
        Scanner n=new Scanner(System.in);

        String s=n.next();

        int p=s.length();


        for(int i=0;i<p;i++)
        {
            char v=s.charAt(i);
            int a=v;
            System.out.println(a+" "+v);
        }


        String q[]=s.split("");

        for(String i:q)
        {
            System.out.println(i);

        }


        for(int i=0;i<s.length();i++)
        {
            System.out.println(q[i]);
        }

        System.out.println(s);


        String s1="jeetu";
        if(s.equals(s1))
        {
            System.out.println("Both string are equals");
        }
        else
        {
            System.out.println("both string are diff.");

        }


        s=s+s1;
        System.out.println(s);

        String k=s;
        System.out.println(k);


        String w=" ";
        w+="a";
        System.out.println(w);


    }
}
