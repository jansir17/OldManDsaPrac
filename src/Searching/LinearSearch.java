package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        //BasicLinear Search
//        int[] arr01 = {3, 17, 23, 144, 5, 8, 15, 28};
//        System.out.println("Element found in index number "+basicLinearSearch(arr01, -10));
        //String
        String name = "Mehrab";
        char character = 'b';
        isCharacterExists(name, character);

    }

    static int basicLinearSearch(int[] arr01, int element){
        int index = 0;
        for(int i: arr01) {
            if (i == element) {
                System.out.println("Value found in index "+index);
                return index;
            }
            else index++;
        }
        return -1;
    }

    static void isCharacterExists(String s, char target){
        if(s.length()== 0) System.out.println("No String found");
        for(int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == target){
                System.out.println("Found the Character in index "+i);
                break;
            }
        }
    }


}
