import java.util.Scanner;
public class Summer {
    public static void main(String[] args) {
        System.out.println("Summing Numbers Until 0\n");
        Scanner in = new Scanner(System.in);
        int input = 1;
        int total = 0;
        while (input != 0) {
            System.out.print("Number to add:  ");
            input = in.nextInt();
            total += input;
            System.out.println("The total is " + total);
        }
        System.out.println("The final total is " + total);
    }}