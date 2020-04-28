import java.util.*;
public class HashSet_in_java {
    public static void main(String[] args)
    {
        HashSet<String> names = new HashSet<String>();

        names.add("Jeetu");
        names.add("Jeetu");
        names.add("Jeetu");
        names.add("Raj");
        names.add("birju");

        System.out.println(names);

        Iterator<String> itr = names.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
}
