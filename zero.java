public class zero {
    public static void main(String[] args) {
        System.out.println(countZeros(1000000,0));
    }

    static int countZeros(int n, int sum){
        if(n <= 0) return sum;
        if(n%10 == 0) return countZeros(n/10, sum + 1);
        return countZeros(n/10,sum);
    }
}
