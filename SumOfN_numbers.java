import java.util.Scanner;

public class SumOfN_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sum(n));

    }

    static int sum(int n){
        int sum =0;
        while(n != 0){
            sum += n;
            n--;
        }
        return sum;
    }
}
