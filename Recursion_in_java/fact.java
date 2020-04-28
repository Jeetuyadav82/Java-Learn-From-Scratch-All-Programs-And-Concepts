package Recursion_in_java;

public class fact {

    public static int facts(int N) {
        if (N <= 1) {
            return 1;
        } else {
            return N * facts(N - 1);
        }
    }
}
