public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.abs(Math.pow(radius, 3));
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        double sum;
        double perimeter;
        if (isTrianglePossible(a, b, c)) {
            perimeter = (a + b + c) / 2;
            sum = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
            return sum;
        } else {
            return -1.0;
        }
    }
}
