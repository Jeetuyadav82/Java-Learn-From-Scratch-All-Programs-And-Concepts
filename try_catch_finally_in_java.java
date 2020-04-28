
// also see the video for all cese important :- https://www.youtube.com/watch?v=nuYdT5q3Gxc&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=37

public class try_catch_finally_in_java {
    public static void main(String[] args)
    {
        try
        {
            int a=100/0;
        }
        catch(Exception e)
        {
            System.out.println("catch called");
            System.out.println(e);
        }
        finally {
            System.out.println("finally called");
        }
    }
}
