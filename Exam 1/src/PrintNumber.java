public class PrintNumber {
    public void printNumbers(int start, int end) {
        for (int x = start; x <= end; x++) {
            System.out.println(x);
        }}
    public static void main(String[] args) {
        System.out.println("Printing 5 to 19 Using a For Loop\n");
        PrintNumber printer = new PrintNumber();
        printer.printNumbers(5, 19);
    }}