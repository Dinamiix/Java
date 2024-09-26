import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int sum = sumTwoNumbers (firstNumber , secondNumber);
        int result = subtractTwoNumbers(sum , thirdNumber);

        System.out.println(result);
    }

    private static int subtractTwoNumbers(int n1, int n2) {
        return n1 - n2;
    }

    private static int sumTwoNumbers(int n1, int n2) {
        return n1 + n2;
    }
}
