package exercise;

class App {
    // BEGIN
    public static String getTypeOfTriangle ( int a,int b, int c) {
        if ((a + b < c) || (a + c < b) || (b + c < a)) {
            return "Треугольник не существует";
        } else
            if ((a == b) && (a == c)) {
                return "Равносторонний";
        }
            else
                if ((a == b) || (a == c) || (b == c)) {
                    return "Равнобедренный";
        } else
        {
                return "Разносторонний";
        }
    }

    public static int getFinalGrade(int exam, int project) {
        if (exam > 90 || project > 10) {
            return 100;
        } else
            if (exam > 75 && project >= 5) {
                return 90;
            } else
                if (exam > 50 && project >= 2) {
                    return 75;
                } else
                {
                    return 0;
                }
    }

    public static void main (String[] args) {
        getTypeOfTriangle(5, 5, 5);
        getTypeOfTriangle(9, 2, 2);
        getTypeOfTriangle(1, 0, 7);

        getFinalGrade(100, 12); // 100
        getFinalGrade(99, 0); // 100
        getFinalGrade(10, 15); // 100
        getFinalGrade(85, 5); // 90
        getFinalGrade(55, 3); // 75
        getFinalGrade(55, 0); // 0
    }
    // END
}
