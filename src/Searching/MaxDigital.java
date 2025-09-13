package Searching;

public class MaxDigital {
    public static void main(String[] args) {
        int[] arr01 = {1, 4, 3, 7, 8};
        System.out.println("highest Number is "+highestDigit(arr01));
    }

    static int highestDigit(int[] arr01) {
        int max = 0;
        int highestValue=0;
        for(int i = 0; i<arr01.length; i++){
            int currentIndexValue = digitCount(arr01[i]);
            if(currentIndexValue>=max)
            {
                max = currentIndexValue;
                highestValue = arr01[i];
            }
        }
        return  highestValue;
    }

    static int digitCount(int number){
        int counter= 0;
        while(number>0){
            counter++;
            number = number/10;
        }
        return counter;
    }

}
