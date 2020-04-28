package Interfaces_in_java;

public class MainClass {
    public static void main(String args[])
    {
        Bank abc = new Bank_abc(); // cant write like :- Bank abc = new Bank() bcoz bank is interface.

        System.out.println(abc.getInterestRate());

        //  class and class = >  extends
        //  class and interface = > implements
        //  interface and interface = > extends

    }
}
