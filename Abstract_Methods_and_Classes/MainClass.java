package Abstract_Methods_and_Classes;

public class MainClass {
    public static void main(String args[])
    {
        Bank abc = new Bank_abc();  // after make abstract of class Bank we cant write like :- bank abc = new Bank()

        System.out.println(abc.getInterestRate());
    }
}
