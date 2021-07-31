public class ReverseArray {

    public static String[] reverse (String[] strings){

//        int i = strings.length - 1;
//        for (int j = 0; j <= i; j++) {
//            String temp = strings[j];
//            strings[j] = strings[i];
//            strings[i] = temp;
//            i--;
//        }

//        int i = strings.length - 1;
//        for (int j = 0; j <= strings.length / 2; j++) {
//            String temp = strings[j];
//            strings[j] = strings[i - j];
//            strings[i - j] = temp;
//        }

        for (int i = 0; i < strings.length / 2; i++) {
            String temp = strings[i];
            strings[i] = strings[strings.length - 1 - i];
            strings[strings.length - 1 - i] = temp;
        }
       return strings;
    }
}
