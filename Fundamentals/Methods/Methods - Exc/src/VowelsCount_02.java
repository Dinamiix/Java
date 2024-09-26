import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();

        printVowelsCount(text);
    }

    private static void printVowelsCount(String text) {

        int countVowels = 0;

        for (char letter : text.toCharArray()) {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                countVowels++;
            }
        }

        System.out.println(countVowels);
    }
}
