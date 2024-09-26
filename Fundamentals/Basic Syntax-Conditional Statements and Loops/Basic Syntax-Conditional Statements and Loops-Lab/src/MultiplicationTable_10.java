import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        for (int multiplier = 1; multiplier <= 10 ; multiplier++) {
            System.out.printf("%d X %d = %d%n", number, multiplier, number * multiplier);

        }

        //стоп: втория множител > 10
        //продължавам: втория множител <= 10
        int multiplier = 1; //втория множител
        while (multiplier <= 10) {
            System.out.printf("%d X %d = %d%n", number, multiplier, number * multiplier);
            multiplier++;
        }
    }
}
