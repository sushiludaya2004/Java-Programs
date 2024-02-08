import java.util.Scanner;

public class srs2 {
    //with  duplicates
    public static void main(String[] args) {

        int[] a = {3,3,1,3,3,3,3};
        int target = 1;
        int n = search(a, target);
        System.out.println(n);
    }

    static int search(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = ( low + high ) / 2;
            if(arr[mid] == target) return mid;
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low++;
                high--;
                continue;
            }
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
