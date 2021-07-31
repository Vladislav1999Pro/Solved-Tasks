public class TwoDimensionalArray {
    public static char symbol = 'X';
    public static char whitespace = ' ';

    public static char[][] getTwoDimensionalArray(int size) {
        char[][] array = new char[size][size];
        for (int i = 0; i < array.length; i++) {
            for ( int j = 0; j < array[i].length; j++){
                array[i][j] = (i == j || (i + j) % (size - 1) == 0) ? symbol : whitespace;
            }
        }
        return array;
    }
}
