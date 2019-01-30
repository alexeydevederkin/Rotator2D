package rotator2d;

import org.junit.jupiter.api.Assertions;


class Rotator2DTest {

    private static final double DELTA = 0.0001;

    private Rotator2D rotator = new Rotator2D();


    @org.junit.jupiter.api.Test
    void rotate2d_1() {
        double x = 1;
        double y = 0;
        double center_x = 0;
        double center_y = 0;
        double angle_degrees = 90;
        double[] x_y = rotator.rotate2d(x, y, center_x, center_y, angle_degrees);
        double[] expected = {0.0, 1.0};
        Assertions.assertArrayEquals(expected, x_y, DELTA);
    }

    @org.junit.jupiter.api.Test
    void rotate2d_2() {
        double x = 1;
        double y = 0;
        double center_x = 0;
        double center_y = 0;
        double angle_degrees = 180;
        double[] x_y = rotator.rotate2d(x, y, center_x, center_y, angle_degrees);
        double[] expected = {-1.0, 0.0};
        Assertions.assertArrayEquals(expected, x_y, DELTA);
    }

    @org.junit.jupiter.api.Test
    void rotate2d_3() {
        double x = 0;
        double y = 1;
        double center_x = 0;
        double center_y = 0;
        double angle_degrees = -180;
        double[] x_y = rotator.rotate2d(x, y, center_x, center_y, angle_degrees);
        double[] expected = {0.0, -1.0};
        Assertions.assertArrayEquals(expected, x_y, DELTA);
    }

    @org.junit.jupiter.api.Test
    void rotate2d_4() {
        double x = 3;
        double y = 1;
        double center_x = 1;
        double center_y = 1;
        double angle_degrees = 90;
        double[] x_y = rotator.rotate2d(x, y, center_x, center_y, angle_degrees);
        double[] expected = {1.0, 3.0};
        Assertions.assertArrayEquals(expected, x_y, DELTA);
    }

    @org.junit.jupiter.api.Test
    void rotate2d_5() {
        double x = 64.02;
        double y = 10.99;
        double center_x = 35.78;
        double center_y = -24.13;
        double angle_degrees = 42.13;
        double[] x_y = rotator.rotate2d(x, y, center_x, center_y, angle_degrees);
        double[] expected = {33.1645, 20.8597};
        Assertions.assertArrayEquals(expected, x_y, DELTA);
    }

    @org.junit.jupiter.api.Test
    void rotate2d_6() {
        double x = 5;
        double y = 5;
        double center_x = 2;
        double center_y = 2;
        double angle_degrees = -720;
        double[] x_y = rotator.rotate2d(x, y, center_x, center_y, angle_degrees);
        double[] expected = {5.0, 5.0};
        Assertions.assertArrayEquals(expected, x_y, DELTA);
    }
}