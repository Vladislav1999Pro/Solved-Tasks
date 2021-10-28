package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        startCalc();

        while (true) {

            System.out.println("Input: ");
            String line = scanner.nextLine();

            if (line.equals("exit")) {
                exitCalc();
                break;
            } else if (line.equals("выход")) {
                exitCalc();
                break;
            }

            try {
                String[] symbols = line.split(" ");
                if (symbols.length != 3) throw new Exception("Что-то пошло не так, попробуйте еще раз");

                Number firstNumber = NumberService.parseAndValidate(symbols[0]);
                Number secondNumber = NumberService.parseAndValidate(symbols[2], firstNumber.getType());
                String result = ArithmeticOperations.calculate(firstNumber, secondNumber, symbols[1]);
                System.out.println("Output: \n" + result);


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void exitCalc() {
        System.out.println("Прощай пользователь");
    }

    private static void startCalc() {
        System.out.println("""
                Консольное приложение Калькулятор, работает только с арабскими и римскими цифрами от 1 до 10.
                Обладает следующими операциями:
                Сложение(+), Вычитание(-), Умножение(*), Деление(/).
                Числа и операции введите через пробел, например: 6 + 6, затем нажмите "Entrer"
                Если Вы хотите покинуть программу, введите 'exit' или 'выход'.
                """);
    }
}