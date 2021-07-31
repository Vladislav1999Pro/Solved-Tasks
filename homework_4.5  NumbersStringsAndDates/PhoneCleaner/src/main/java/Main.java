import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      String newInput = input.replaceAll("[^0-9]", "");
      if (newInput.length() == 10) {
          newInput = 7 + newInput;
      }
      StringBuilder builder = new StringBuilder();
      builder.append(newInput);
      builder.setCharAt((char)0, '7');
      Pattern pattern = Pattern.compile("^((79)(\\d{9}))$");
      Matcher matcher = pattern.matcher(builder);

      if (matcher.matches()) {
        System.out.println(builder);
      } else {
        System.out.println("Неверный формат номера");
      }
    }
  }

}
