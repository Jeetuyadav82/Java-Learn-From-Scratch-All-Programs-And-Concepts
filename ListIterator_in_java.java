import java.util.*;
public class ListIterator_in_java {
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("jeetu");
        names.add("fdv");
        names.add("vdsdasvc");

        ListIterator<String> itr = names.listIterator();
        {
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }

            System.out.println(" ");

            while(itr.hasPrevious())
            {
                System.out.println(itr.previous());
            }

        }


    }
}
