public class rec {
    public static void main(String[] args) {
        //System.out.println(fibo(6));
        fib(9);
    }

    static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    static void fib(int n){
        if(n == 0 || n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(fibo(n-1) + fibo(n-2));
    }
}
