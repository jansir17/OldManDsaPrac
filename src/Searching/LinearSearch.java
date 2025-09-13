package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr01 = {3, 17, 23, 144, 5, 8, 15, 28};
        int index = 0;
        for(int i: arr01) {
            if (i == 28) {
                System.out.println("Value found in index "+index);
                break;
            }
            else index++;
        }
    }
}
