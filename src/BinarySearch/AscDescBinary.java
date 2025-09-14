package BinarySearch;

public class AscDescBinary {
    public static void main(String[] args) {
        int targetValue =55;
        int[] arr01 = {2, 5, 23, 45, 56, 76, 789, 898, 3455};
        int[] arr02 = {3453, 455, 443, 323, 100, 55, 44, 33, 11, 1};
        System.out.println(findTargetValue(arr02, targetValue));
    }

    static int findTargetValue(int[] arr, int targetValue) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[0] < arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == targetValue) return mid;
            if (isAsc) {
                if (targetValue < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (targetValue > arr[mid]) {
                    end = mid - 1;
                } else
                    start = mid + 1;    
            }
        }
        return -1;

    }

}
