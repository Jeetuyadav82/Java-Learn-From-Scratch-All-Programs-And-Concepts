package static_keyword_in_java;

public class myclass {
    public static void main(String args[])
    {
        Hello hello = new Hello();

        Hello.DoSome123("hii");  // this is right way and :- hello.Dosome123 is wrong due to static

        hello.DoSome("how r u"); //  this is right way and :- Hello.Dosome123 is wrong due to static

        /*

        so we can  say that :--1.- static keyword will accessed by class like :- Hello.DoSome123("hii");
                               2.- non static keyword will accessed by instance object like :- hello.DoSome("how r u");

         */
    }
}
