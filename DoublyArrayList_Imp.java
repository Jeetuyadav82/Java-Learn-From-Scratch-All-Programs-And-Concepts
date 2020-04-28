import java.util.*;
public class DoublyArrayList_Imp {
    public static void main(String  args[])
    {
        Scanner n=new Scanner(System.in);

        ArrayList[] arr=new ArrayList[3];

        arr[0]=new ArrayList<Integer>();
        arr[1]=new ArrayList<Integer>();
        arr[2]=new ArrayList<Integer>();

        arr[0].add(1);
        arr[0].add(1);
        arr[1].add(1);
        arr[1].add(1);
        arr[2].add(1);
        arr[2].add(1);


        for(int i=0;i<3;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println(arr[0].get(1));

    }
}
