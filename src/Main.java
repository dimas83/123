import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = in.nextInt();
        System.out.println("Input b: ");
        int b = in.nextInt();
        System.out.println("Input c: ");
        int c = in.nextInt();
        int x1 = (int) (-b + Math.sqrt(b*b-4*a*c)/2*a);
        int x2 = (int) (-b - Math.sqrt(b*b-4*a*c)/2*a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
