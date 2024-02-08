import java.util.Scanner;

public class srs {
    public static void main(String[] args) {
        int[] arr = {7,8,9,0,1,2,3,4,5};
        System.out.println("Enter number between 0 - 9 : ");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int n = search(arr, target);
        System.out.println(n);
    }

    static int search(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = ( low + high ) / 2;
            if(arr[mid] == target) return mid;

            if (arr[low] <= arr[mid]){
                if(arr[low] <= target && target <= arr[mid] ){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(arr[mid] <= target && target <= arr[high] ){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
