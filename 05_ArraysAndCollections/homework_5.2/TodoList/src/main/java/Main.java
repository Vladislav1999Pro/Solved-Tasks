import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final TodoList todoList = new TodoList();

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду:\nADD - добавить дело;\nLIST - вывод списка дел;"
                + "\nEDIT - заменяет дело с указанным номером;\nDELETE — удаляет;\nEXIT - выход из программы.");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("EXIT")) {
                break;
            } else if (input.startsWith("ADD")) {

                String partInput = input.substring(3).trim();
                int SpaceIndex = partInput.indexOf(' ');

                Pattern pattern = Pattern.compile("^[A-z]*\\s(\\d*)\\s.+");
                Matcher matcher = pattern.matcher(input);

                if (matcher.find()) {
                    if (matcher.group(1) != null) {
                        todoList.add(Integer.parseInt(matcher.group(1)), partInput.substring(SpaceIndex).trim());
                    }
                } else {
                    todoList.add(partInput);
                }
            } else if (input.startsWith("LIST")) {
                todoList.getTodos();
            } else if (input.startsWith("EDIT")) {
                todoList.edit(input.substring(6).trim(), Integer.parseInt(input.substring(4, 6).trim()));
            } else if (input.startsWith("DELETE")) {
                int spaceIndex = input.indexOf(' ');
                todoList.delete(Integer.parseInt(input.substring(spaceIndex).trim()));
            }
        }
    }
}

