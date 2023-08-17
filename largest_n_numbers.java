import java.util.Scanner;

public class largest_n_numbers {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int max=a;
            while(true){
                int b = in.nextInt();
                if(a == 0 || b==0){
                    break;
                } else if (max <b) {
                    max = b;
                    System.out.println("Largest number: " + max);
                } else {
                    System.out.println("Largest number: " + max);
                }
            }

    }
}