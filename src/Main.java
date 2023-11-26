import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double FromHome = 1.0;
        double Total = 0.0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                FromHome /= i;
                Total += FromHome;
            } else {
                FromHome /= i;
                Total -= FromHome;
            }
        }

        System.out.println("Расстояние от дома после 100-го этапа: " + FromHome);
        System.out.println("Общий пройденный путь: " + Total);
    }
}