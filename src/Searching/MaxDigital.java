package Searching;

public class MaxDigital {
    public static void main(String[] args) {
        int[] arr01 = {1, 434, 33, 734, 4};
        System.out.println("highest Number is "+highestDigit(arr01));
    }

    static int highestDigit(int[] arr01) {
        if (arr01==null || arr01.length==0) return -1;
        int max = 0;
        int highestValue=0;
        for (int j : arr01) {
            int currentIndexValue = digitCount(j);
            if (currentIndexValue >= max) {
                max = currentIndexValue;
                highestValue = j;
            }
        }
        return  highestValue;
    }
      //Style01 Following
//    static int digitCount(int number){
//        int counter= 0;
//        while(number>0){
//            counter++;
//            number = number/10;
//        }
//        return counter;
//    }

    //Style02 Following.
    static int digitCount(int n) {
        if (n == 0) return 1;
        n = Math.abs(n);
        return (int) Math.floor(Math.log10(n)) + 1;
    }

    //Style03 Following
//    static int digitCount(int n) {
//        return String.valueOf(Math.abs(n)).length();
//    }

}
