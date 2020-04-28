package classes_and_object_part2_imp;

public class classes_and_object_more_right {
    public static void main(String args[])
    {
        student jeet = new student();// instance or object
        jeet.setid(1);
        jeet.setname("jeetu");
        jeet.setage(20);

        System.out.println(jeet.getname() + "'s age is " + jeet.getage() + " and id is " + jeet.getid());


    }
}
