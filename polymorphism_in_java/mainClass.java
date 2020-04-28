package polymorphism_in_java;

public class mainClass {
    public static void main(String args[])
    {
        Bank abc = new Bank_abc();
        Bank def = new Bank_def();
        Bank xyz = new Bank_xyz();

        System.out.println(abc.getInterestRate());
        System.out.println(def.getInterestRate());
        System.out.println(xyz.getInterestRate());

    }
}
