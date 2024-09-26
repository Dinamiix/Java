package Articles_02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author = input.split(", ")[2];

        Articles article = new Articles(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {

            String row = scanner.nextLine();
            String commandName = row.split(": ")[0];
            String newValue = row.split(": ")[1];

            switch (commandName) {
                case "Edit":
                    article.edit(newValue);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(newValue);
                    break;
                case "Rename":
                    article.rename(newValue);
                    break;
            }
        }

        System.out.println(article);
    }
}
