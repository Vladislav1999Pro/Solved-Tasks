public class Main {

  public static void main(String[] args) {

    int result = calculateSalarySum("Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей");
    System.out.println(result);
  }

  public static int calculateSalarySum(String text) {
    int result = 0;
    String[] sentence = text.split(",");
    for (int i = 0; i < sentence.length; i++) {
      String a = sentence[i].replaceAll("[^0-9]", "").trim();
      if (a.length() > 0){
        result += Integer.parseInt(a);
      }
    }
    return result;
  }
}