import java.util.Scanner;
public class TenMaker {
    public static void main(String[] args) {
        System.out.println("Does it add to 10?\n");
        Scanner in = new Scanner(System.in);
        System.out.print("What's your first number?    ");
        int x = in.nextInt();
        System.out.print("What's your second number?    ");
        int y = in.nextInt();
        System.out.println(makes10(x, y));
    }
    public static boolean makes10(int x, int y) {
        return (x + y == 10);
    }}