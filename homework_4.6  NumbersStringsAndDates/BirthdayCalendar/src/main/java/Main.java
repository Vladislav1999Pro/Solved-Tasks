import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {

        int day = 2;
        int month = 1;
        int year = 1973;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
       LocalDate birthDay = LocalDate.of(year, month, day);
       int number = 0;
       StringBuilder text = new StringBuilder();
       while (!birthDay.isAfter(LocalDate.now())) {
           String dateFormat = birthDay.format(DateTimeFormatter.ofPattern(number + " - dd.MM.yyyy - EEE",  Locale.ENGLISH));
           text.append(System.lineSeparator()).append(dateFormat);
           number++;
           birthDay = birthDay.plusYears(1);
       }
       return text.toString();
    }
}
