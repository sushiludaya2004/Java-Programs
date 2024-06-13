public class steps {
    public static void main(String[] args) {
        System.out.println(steps(8,0));
    }

    static int steps(int n, int step){
        if(n == 0) return step;
        if(n % 2 == 0) return steps(n/2, step + 1);
        return steps(n-1, step+1);
    }


}
