import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a name here: ");
        String name = scan.nextLine();
        long end = System.currentTimeMillis();
        long diff = end - start;
        System.out.println("It took you " + (diff / 1000) + " seconds!");

        float x = 10.5f; //huh
    }
}
