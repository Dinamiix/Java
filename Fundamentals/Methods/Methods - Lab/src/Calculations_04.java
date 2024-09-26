import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        executeCommand(command, firstNumber, secondNumber);

    }
    private static void executeCommand(String command, int firstNumber, int secondNumber) {

        switch (command) {
            case "add":
                sumAndPrint (firstNumber , secondNumber);
                    break;
            case "multiply":
                multiplyAndPrint (firstNumber , secondNumber);
                break;

            case "subtract":
                subtractAndPrint (firstNumber , secondNumber);
                break;
            case "divide":
                divideAndPrint (firstNumber , secondNumber);
                break;
        }
    }

    private static void divideAndPrint(int n1, int n2) {
        System.out.println(n1 / n2 );
    }

    private static void subtractAndPrint(int n1, int n2) {
        System.out.println(n1 - n2);
    }

    private static void multiplyAndPrint(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    private static void sumAndPrint(int n1, int n2) {
        System.out.println(n1 + n2);
    }
}
