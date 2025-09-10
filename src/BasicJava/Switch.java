package BasicJava;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();

        switch (fruit) {
            case "Mango":
                System.out.println("You like Mango");
                break;
            case "Apple":
                System.out.println("You like Apple");
                break;
            default:
                System.out.println("you are not a fruit guy");
                break;
        }
    }
}
