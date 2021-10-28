package calculator;

public class ArithmeticOperations {
    public static String calculate(Number firstNumber, Number secondNumber, String action) throws Exception {
        int result;
        switch (action) {
            case "+":
                result = firstNumber.getValue() + secondNumber.getValue();
                break;
            case "-":
                result = firstNumber.getValue() - secondNumber.getValue();
                break;
            case "*":
                result = firstNumber.getValue() * secondNumber.getValue();
                break;
            case "/":
                result = firstNumber.getValue() / secondNumber.getValue();
                break;
            default:
                throw new Exception("Не правильно введен символ операции, используйте только +, -, *, /");
        }

        if (firstNumber.getType() == NumberType.ROMAN) {
            return NumberService.toRomanNumber(result);
        } else return String.valueOf(result);
    }
}