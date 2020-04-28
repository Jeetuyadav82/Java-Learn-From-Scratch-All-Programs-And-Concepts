package classes_and_objects_part1;

public class classes_and_objects {
    public static void main(String args[])
    {
        student jeet = new student();// instance or object
        jeet.id=1;
        jeet.name= "jeetu";
        jeet.age=20;

        student brij = new student();// instance or object
        brij.id=2;
        brij.name = "Brijmohan";
        brij.age = 13;

        System.out.println(jeet.name + "'s age is " + jeet.age + " and id is " + jeet.id);
        System.out.println(brij.name + "'s age is " + brij.age + " and id is " + brij.id);
    }
}
