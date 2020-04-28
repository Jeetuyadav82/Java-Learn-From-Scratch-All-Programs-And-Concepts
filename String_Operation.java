public class String_Operation {
    public static void main(String args[])
    {
        String s="Hello Word";

        String s1=s.toLowerCase();
        System.out.println(s1);

        String s2=s.toUpperCase();
        System.out.println(s2);

        String s3=s.replace("e","a");
        System.out.println(s3);

        System.out.println(s.indexOf("W"));
        System.out.println(s.indexOf("k"));
        System.out.println(s.indexOf(" "));
        System.out.println(s.indexOf(" W"));
    }
}
