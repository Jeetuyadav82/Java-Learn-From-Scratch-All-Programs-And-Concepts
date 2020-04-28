import java.util.*;
public class parameter_passing_and_Returning_a_value_from_method {
    public static void main(String args[])
    {
        // pass string
        pass_string("Jeetu");

        int a=5;
        int b=5;

        // pass integer
        int add=pass_int_and_return(a,b);
        System.out.println(add);

        // pass array
        int arr[]=new int[]{1,2,3,4};
        int p= pass_array_and_return(arr);
        System.out.println(p);

        // pass arraylist
        ArrayList<Integer> arrli = new ArrayList<>();
        arrli.add(1);
        arrli.add(2);

        pass_arraylist_and_print(arrli);


    }

    static void pass_string(String name)
    {
        System.out.println("hello" + name);
    }

    static int pass_int_and_return(int a,int b)
    {
        return a+b;
    }

    static int pass_array_and_return(int arr[])
    {
        return arr[0];
    }

    static void pass_arraylist_and_print(ArrayList<Integer> arrli)
    {
        System.out.println(arrli);
    }


}
