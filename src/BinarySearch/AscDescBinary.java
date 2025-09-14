package BinarySearch;

public class AscDescBinary {
    public static void main(String[] args) {
        int targetValue = 3;
        int[] arr01 = {2, 5, 23, 45, 56, 76, 789, 898, 3455};
        //int[] arr02 = {3453, 455, 43, 23,12, 5, 4, 3, 1};
        System.out.println( findTargetValue(arr01, targetValue));
    }

    static int findTargetValue(int[] arr01, int targetValue) {
        int start = 0;
        int end = arr01.length-1;
        System.out.println(end);
        //boolean isAsc = arr01[0] < arr01.length - 1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if (arr01[mid] == targetValue) return mid;
            else {
                if (targetValue < arr01[mid]) {
                    end = mid - 1;
                } else if (targetValue > arr01[mid]){
                    start = mid + 1;
                }
                else return mid;
            }
        }
        return -1;
    }


}
