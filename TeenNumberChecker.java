import java.util.Scanner;

public class TeenNumberChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(hasNotTeen(a,b,c));
    }

    static boolean hasNotTeen(int a, int b, int c) {
        return !((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));

    }
}

