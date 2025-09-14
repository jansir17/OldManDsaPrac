package BinarySearch;

import java.util.Arrays;

public class RangeOfNumbers {
    public static void main(String[] args) {
        int[] arr01 = {1, 2, 3, 4, 5, 6,6,6,6,6,7,7,7,8,8,8,9,10,10};
        int targetValue = 10;

        int index1 = searchingRange(arr01, targetValue, true);
        int index2 = searchingRange(arr01, targetValue, false);
        int[] ans = {index1, index2};
        System.out.println(Arrays.toString(ans));
    }

    static int searchingRange(int[] arr, int target, boolean result){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target>arr[mid]) {
                    start = mid + 1;
                }
                else{
                    ans = mid;
                    if(result){
                        end = mid - 1;
                    }
                    else{
                        start = mid + 1;
                    }
                }
            }
        return ans;
    }
}
