package rotator2d;

import java.util.Locale;

public class Rotator2D {

    /*
     *  Rotation in 2D space
     *
     *  (x, y) - point to rotate
     *  (center_x, center_y) point, around which to rotate
     *  angle_degrees - angle of rotation around point (counter-clockwise)
     */
    public double[] rotate2d (double x, double y,
                              double center_x, double center_y,
                              double angle_degrees) {

        double[] x_y = new double[2];

        double angle_radians = angle_degrees * Math.PI / 180;

        // rotation
        // X = x0 + (x - x0) * cos(a) - (y - y0) * sin(a);
        // Y = y0 + (y - y0) * cos(a) + (x - x0) * sin(a);

        x_y[0] = center_x + (x - center_x) * Math.cos(angle_radians) - (y - center_y) * Math.sin(angle_radians);
        x_y[1] = center_y + (y - center_y) * Math.cos(angle_radians) + (x - center_x) * Math.sin(angle_radians);

        return x_y;
    }


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Rotator2D rotator = new Rotator2D();

        double x = 1;
        double y = 0;
        double center_x = 0;
        double center_y = 0;
        double angle_degrees = 90;
        double[] x_y = rotator.rotate2d(x, y, center_x, center_y, angle_degrees);
        System.out.println("x = 0.0000, y = 1.0000  <- expected");
        System.out.printf("x = %.4f, y = %.4f\n\n", x_y[0], x_y[1]);

        x = 1;
        y = 0;
        center_x = 0;
        center_y = 0;
        angle_degrees = 180;
        x_y = rotator.rotate2d(x, y, center_x, center_y, angle_degrees);
        System.out.println("x = -1.0000, y = 0.0000  <- expected");
        System.out.printf("x = %.4f, y = %.4f\n\n", x_y[0], x_y[1]);

        x = 0;
        y = 1;
        center_x = 0;
        center_y = 0;
        angle_degrees = -180;
        x_y = rotator.rotate2d(x, y, center_x, center_y, angle_degrees);
        System.out.println("x = 0.0000, y = -1.0000  <- expected");
        System.out.printf("x = %.4f, y = %.4f\n\n", x_y[0], x_y[1]);

        x = 3;
        y = 1;
        center_x = 1;
        center_y = 1;
        angle_degrees = 90;
        x_y = rotator.rotate2d(x, y, center_x, center_y, angle_degrees);
        System.out.println("x = 1.0000, y = 3.0000  <- expected");
        System.out.printf("x = %.4f, y = %.4f\n\n", x_y[0], x_y[1]);

        x = 64.02;
        y = 10.99;
        center_x = 35.78;
        center_y = -24.13;
        angle_degrees = 42.13;
        x_y = rotator.rotate2d(x, y, center_x, center_y, angle_degrees);
        System.out.println("x = 33.1645, y = 20.8597  <- expected");
        System.out.printf("x = %.4f, y = %.4f\n\n", x_y[0], x_y[1]);
    }
}
