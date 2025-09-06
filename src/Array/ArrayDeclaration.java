package Array;

public class ArrayDeclaration {
    public static void main (String[] args){
        int[] array01 = new int[5]; //Declaration + Initialization
        int[] array02;              // Declaration ONLY
        array02 = new int[5];       // Initialization Only by Mentioning size
        int[] array03 = {01, 02, 03}; // Declaring Array with value in it.
        System.out.println(array03[2]);
    }
}

//#So-01
//dataype=>int[] , array01=>referecen variable, new Int[5]=> Creating an object in HEAP memory
//Left Handside happenes in Compile TIME
//Right Handside happnes in Run Time + //This is known as Dynamic memory allocation

//So array01   in Stack Memory
//new int[05]; in Heap memory
