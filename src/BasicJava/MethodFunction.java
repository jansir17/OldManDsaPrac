package BasicJava;

public class MethodFunction {
    public static void main(String[] args) {
        String name = "Mehrab";
        System.out.println(name);
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String nameName) {
        System.out.println(nameName);
        nameName = "Rokon";
        System.out.println(nameName);
    }
}
