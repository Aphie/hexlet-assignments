package exercise;

import java.lang.reflect.Array;
import java.util.Arrays;

class Point {
    // BEGIN
    //makePoint() — принимает на вход координаты и возвращает точку
    public static int[] makePoint (int x, int y) {
        int[] point = {x, y};
        return point;
    }

    //getX() — принимает на вход точку и возвращает координату по оси x
    public static int getX (int[] point) {
        return point[0];
    }

    //getY() — принимает на вход точку и возвращает координату по оси y
    public static int getY (int[] point) {
        return point[1];
    }

    //pointToString() — принимает на вход точку и возвращает её строковое представление
    public static String pointToString(int[] point) {
        String strPoint = "("+point[0]+", "+point[1]+")";
        return strPoint;
    }

    //getQuadrant() — принимает на вход точку и возвращает номер квадранта, в котором эта точка расположена
    public static int getQuadrant(int[] point) {
        if (point[0] == 0 || point[1] == 0) {
            return 0;
        } else if (point[0] > 0) {
            if (point[1] > 0) {
                return 1;
            } else {
                return 4;
            }
        } else if (point[1] > 0) {
            return 2;
        } else {
            return 3;
        }
    }

    //getSymmetricalPointByX() - принимает в качестве аргумента точку и возвращает новую точку, симметричную исходной относительно оси Х
    public static int[] getSymmetricalPointByX(int[] point){
        int[] symmetricalPointByX = {point[0],-point[1]};
        return symmetricalPointByX;
    }
    //сalculateDistance() - принимает в качестве аргументов две точки и возвращает расстояние между этими точками
    public static double calculateDistance (int[] point1, int[] point2) {
        double distance = Math.sqrt(Math.pow((point2[0] - point1[0]),2) + Math.pow(point2[1] - point1[1],2));
        return distance;
    }

    public static void main (String[] args) {
        int[] point = Point.makePoint(3, 4);
        Point.getX(point); // 3
        Point.getY(point); // 4
        Point.pointToString(point); // "(3, 4)"

        Point.getQuadrant(point); // 1
        int[] point2 = makePoint(3, -3);
        Point.getQuadrant(point2); // 4
        int[] point3 = makePoint(0, 7);
        Point.getQuadrant(point3); // 0

        int[] pointA = makePoint(-3, -6);
        int[] symmetricalPoint = getSymmetricalPointByX(pointA);
        Point.pointToString(symmetricalPoint); // (-3, 6)

        int[] pointB = makePoint(0, 0);
        int[] pointC = makePoint(3, 4);
        Point.calculateDistance(pointB, pointC); // 5
    }

    // END
}
