public class Main {

    public static void main(String[] args) {

        String safe = searchAndReplaceDiamonds("Номер кредитной карты <4008 1234 5678> 8912", "***");
        System.out.println(safe);
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {

        int firstDiamond = text.indexOf('<');
        int secondDiamond = text.indexOf('>');

        if (text.length() == 0 || text.indexOf('<') == -1 || text.indexOf('>') == -1) {
            return text;
        }

        String informBeforeSecretCod = text.substring(0, firstDiamond);
        String informAfterSecretCod = text.substring(secondDiamond + 1);
        return informBeforeSecretCod + placeholder + informAfterSecretCod;
    }
}