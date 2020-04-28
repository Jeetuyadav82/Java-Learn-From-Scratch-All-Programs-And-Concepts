import java.util.*;
public class take_input {
    public static void main(String args[])
    {
        System.out.println("Enter integer input :- ");
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        System.out.println("Entered Integer is :- "+a);
        System.out.println("Enter string input :- ");
        String s=n.next();
        System.out.println("Entered String is :- "+s);
    }
}
