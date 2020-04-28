package static_keyword_in_java;

public class Hello {
    public static String DoSome123(String msg) // accessed by class object
    {
        return msg;
    }

    public String DoSome(String msg)  // accessed by instance object
    {
        return msg;
    }

}
