package BasicJava;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.println(num);
            //So always smaller to bigger type, Java does it implicitly,
            //But to bigger to smaller we have to do as following explicitly

        float fl = sc.nextFloat();
        int flToint = (int) fl;
        System.out.println(flToint);
    }
}

