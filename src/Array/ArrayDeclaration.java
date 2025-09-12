package Array;

public class ArrayDeclaration {
    public static void main (String[] args){
        int[] array01 = new int[5]; //Declaration + Initialization
        int[] array02;              // Declaration ONLY
        array02 = new int[5];       // Initialization Only by Mentioning size
        int[] array03 = {4, 1777, 15, 199, 999999 , 5, 1000}; // Declaring Array with value in it

        whatIsMaxValue(array03);
    }

    static void whatIsMaxValue(int[] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length;i++)
        {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Big Number is "+ max);
    }
}

//#So-01
//dataype=>int[] , array01=>referecen variable, new Int[5]=> Creating an object in HEAP memory
//Left Handside happenes in Compile TIME
//Right Handside happnes in Run Time + //This is known as Dynamic memory allocation

//So array01   in Stack Memory
//new int[05]; in Heap memory
