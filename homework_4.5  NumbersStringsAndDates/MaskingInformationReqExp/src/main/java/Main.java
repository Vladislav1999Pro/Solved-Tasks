public class Main {

    public static void main(String[] args) {

    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        if (text.contains("<") && text.contains(">")) {
            return text.replaceAll("<.+?>", placeholder);
        }
        return text;
    }

}