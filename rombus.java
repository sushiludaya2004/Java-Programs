public class rombus {
    public static void main(String[] args) {
        rhombus(5);
    }

    static void rhombus(int n){

        for(int row = 1; row <= n; row++){
            for (int spaces = 1; spaces < row; spaces++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
