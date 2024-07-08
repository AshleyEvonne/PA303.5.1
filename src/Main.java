//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Printing a multiplication table
        int multiTable = 12;

        for (int i = 1; i <= multiTable; i++) { // rows?
            for (int j = 1; j <= multiTable; j++) {// columns?
                System.out.print((i * j) + "\t");

            }
            System.out.println();
        }
    }
}