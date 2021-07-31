import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
        String input = scanner.nextLine();
        if (input.equals("0")) {
            break;
        }

        int f = input.indexOf(" ");
        int n = input.lastIndexOf(" ");

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ' && input.charAt(0) != ' ') {
                count++;
            }
        }

        int countDash = 0;
        for ( int k =0; k < input.length(); k++) {
            if (input.charAt(k) == '-' && input.charAt(0) != '-' ) {
                countDash++;
            }
        }

        int number = 0;
        int j;
        for (j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            if (!(Character.isLetter(ch) || ch == ' ' || ch == '-') ) {
                number++;
            }
        }

        if (number >= 1 || (count != 2 && countDash != 1)) {
            System.out.println("Введенная строка не является ФИО");
        } else {
            System.out.println("Фамилия: " + input.substring(0, f).trim());
            System.out.println("Имя: " + input.substring(f + 1, n).trim());
            System.out.println("Отчество: " + input.substring(n + 1).trim());
        }
    }
  }
}