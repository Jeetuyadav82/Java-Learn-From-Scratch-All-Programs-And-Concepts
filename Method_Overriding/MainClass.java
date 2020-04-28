package Method_Overriding;

public class MainClass {
    public static void main(String args[])
    {
        Bank abc= new Bank_abc();

        System.out.println(abc.getInterestRate()); // in prevoious in Bank (parent class) interest rate was 0 which is override by 10 in subclass (Bank_abc)
    }
}
