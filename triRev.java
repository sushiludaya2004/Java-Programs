public class triRev {
    public static void main(String[] args) {
        tri(4,4);
    }

    static void tri(int n, int times){
        if(n <= 0 ) return;
        if(times >= 1) {
            System.out.print("*");
            tri(n,times-1);
        } else {
            System.out.println();
            tri(n - 1, n - 1);
        }
    }
}
