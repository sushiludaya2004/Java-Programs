public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(linearSearch(arr, 0, 7));
    }

    static int linearSearch(int[] arr, int s, int target){
        if(s >= arr.length) return -1;
        if(arr[s] == target) return s;
        return linearSearch(arr, s+1, target);
    }
}
