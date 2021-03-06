import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Test for module 4 homework 3 GeometryCalculator method isTrianglePossible
 */

@DisplayName("Тест метода isTrianglePossible класса GeometryCalculator")
public class TestIsTrianglePossible {

    @Test
    @DisplayName("Передан неверно построенный треугольник. Сторона 'a' равна 1, сторона 'b' равна 20, сторона 'c' равна 40")
    void testIsTrianglePossibleWithWrongPositiveSides() {
        assertFalse(GeometryCalculator.isTrianglePossible(1, 20, 40));
    }

    @Test
    @DisplayName("Передан верно построенный треугольник. Сторона 'a' равна 3, сторона 'b' равна 4, сторона 'c' равна 5")
    void testIsTrianglePossibleWithRightPositiveSides() {
        assertTrue(GeometryCalculator.isTrianglePossible(3, 4, 5));
    }

    @Test
    @DisplayName("Передан неверно построенный треугольник. Сторона 'a' равна -1, сторона 'b' равна -20, сторона 'c' равна -40")
    void testIsTrianglePossibleWithNegativeSides() {
        assertFalse(GeometryCalculator.isTrianglePossible(-1, -20, -40));
    }

    @Test
    @DisplayName("Передан неверно построенный треугольник. Сторона 'a' равна -3, сторона 'b' равна 4, сторона 'c' равна 5")
    void testIsTrianglePossibleWithOneNegativeSideAndTwoPositiveSides() {
        assertFalse(GeometryCalculator.isTrianglePossible(-3, 4, 5));
    }

    @Test
    @DisplayName("Передан неверно построенный треугольник. Сторона 'a' равна 0, сторона 'b' равна 0, сторона 'c' равна 0")
    void testIsTrianglePossibleWithZeroSides() {
        assertFalse(GeometryCalculator.isTrianglePossible(0, 0, 0));
    }

    @Test
    @DisplayName("Передан неверно построенный треугольник. Сторона 'a' равна 3, сторона 'b' равна 0, сторона 'c' равна 5")
    void testIsTrianglePossibleWithOneZeroSideAndTwoPositiveSides() {
        assertFalse(GeometryCalculator.isTrianglePossible(3, 0, 5));
    }

    @Test
    @DisplayName("Передан верно построенный треугольник. Сторона 'a' равна 1.5, сторона 'b' равна 2, сторона 'c' равна 3")
    void testIsTrianglePossibleWithOneFractionalSideAndTwoPositiveSides() {
        assertTrue(GeometryCalculator.isTrianglePossible(1.5, 2, 3));
    }
    
}
