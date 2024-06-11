public class patterns {
    public static void main(String[] args) {
        pattern28(5);
    }

    static void pattern3(int n){
        for(int r = n; r > 0; r--){
            for (int c = 0; c < r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int r = 1; r<=n; r++){
            int i =1;
            for(int c = 1; c <= r; c++){
                System.out.print(i++ + " " );
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 0; row < n * 2; row++) {
            int totalColsInRow = row > n ? n - (row - n) : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern17(int n){
        for (int row = 1; row < 2*n ; row++) {
            int totalColsInRow = row > n ? n - (row - n) : row;

            int spaces = n - totalColsInRow;
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }
            for (int col = totalColsInRow; col > 0; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= totalColsInRow; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    static void pattern28(int n){
        for (int row = 0; row < n * 2; row++) {
            int totalColsInRow = row > n ? n - (row - n) : row;
            int spaces = n - totalColsInRow;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern30(int n){
        for (int row = 1; row <= n ; row++) {
            int spaces = n - row;
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }
            for (int col = row; col > 0; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}
