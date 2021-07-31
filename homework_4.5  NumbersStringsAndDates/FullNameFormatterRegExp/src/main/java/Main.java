import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }

      int count = 0;
      String[] sentence = input.split(" ");
      for (int i = 0; i < sentence.length; i++) {
          if (stringStatus(sentence[i])) {
              count++;
          }
      }
      if (sentence.length != 3 || count == 0) {
          System.out.println("Введенная строка не является ФИО");
      } else {
          System.out.println("Фамилия: " + sentence[0]);
          System.out.println("Имя: " + sentence[1]);
          System.out.println("Отчество: " + sentence[2]);
      }
    }
  }
  public static boolean stringStatus(String sentence) {
      if (sentence.matches("\\d+")) {
          return false;
      } else {
          return true;
      }
  }
}