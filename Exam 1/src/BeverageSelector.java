import java.util.Scanner;
public class BeverageSelector {
    public static void main(String[] args) {
        System.out.print("Beverage Selector\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like 1: Water, 2: Coke, or 3: Coffee?   ");
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number!");
            return;
        }
        int beverage_number = in.nextInt();
        if (beverage_number == 1) {
            System.out.println("Water");
        } else if (beverage_number == 2) {
            System.out.println("Coke");
        } else if (beverage_number == 3) {
            System.out.println("Coffee");
        }}}