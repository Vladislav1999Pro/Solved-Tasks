public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    //System.out.println(text);
    int v = text.indexOf("Вася");
    int v1 = text.indexOf("рублей");
    String str1 = text.substring(v + 14, v1).trim();
    //System.out.println(text.substring(v + 14, v1).trim()); //для проверки
    int p = text.indexOf("Петя");
    int p1 = text.indexOf("рубля");
    String str2 = text.substring(p + 6, p1).trim();
    //System.out.println(text.substring(p + 6, p1).trim()); //для проверки

    int m = text.indexOf("Маша");
    int m1 = text.lastIndexOf(" ");
    String str3 = text.substring(m+6, m1).trim();
    //System.out.println(text.substring(m+6, m1).trim());//для проверки

    int sum = Integer.parseInt(str1) + Integer.parseInt(str2) + Integer.parseInt(str3);
    System.out.println(sum);
  }

}