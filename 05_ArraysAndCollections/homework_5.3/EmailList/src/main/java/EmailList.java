import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {

    Set<String> emailSet = new TreeSet<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется
//       Pattern pattern = Pattern.compile("^.+@.+\\..+$");
//       Matcher matcher = pattern.matcher(email);
//       if (matcher.find()) {
        if (email.matches("^.+@.+\\..+$")) {
            emailSet.add(email.toLowerCase());
        } else {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке
        List<String> list = new ArrayList<>(Collections.emptyList());
        list.addAll(emailSet);
        if (emailSet.isEmpty()) {
            return Collections.emptyList();
        } else {
            for (String item : list) {
                System.out.println(item);
            }
        }
        return new ArrayList<>(list);
    }

}
