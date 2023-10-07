import java.util.Random;

public class n4 {
    public static void main(String[] args) {
        // Задание 1
        int[] c1 = new int[11];
        int value = 4;
        for (int i = 0; i < c1.length; i++) {
            c1[i] = value;
            value += 2;
        }

        // Вывод массива c1
        System.out.println("array c1:");
        for (int i = 0; i < c1.length; i++) {
            System.out.print(c1[i] + " ");
        }
        System.out.println(); 

        // Задание 2
        double[] x = new double[10];
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = -8.0 + (20.0 * random.nextDouble());
        }

        // Вывод массива x
        System.out.println("array x:");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%.5f ", x[i]);
        }
        System.out.println(); 

        // Задание 3
        double[][] c = new double[11][10];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if (c1[i] == 16) {
                    c[i][j] = Math.pow(Math.E, Math.cbrt(Math.cbrt(x[j])));
                } else if (c1[i] == 6 || c1[i] == 10 || c1[i] == 18 || c1[i] == 22 || c1[i] == 24) {
                    c[i][j] = (3.0/4.0) / (1.0/4.0 - Math.pow(Math.pow(2.0 * (x[j] - 1), x[j]), Math.log(Math.abs(x[j]))/2));
                } else {
                    c[i][j] = Math.cbrt(Math.tan(Math.log(Math.acos(((x[j] + 2) / 2.0) * Math.E + 1))));
                }
            }
        }

        // Вывод результатов
        System.out.println("final array c:");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.printf("%10.5f ", c[i][j]);
            }
            System.out.println();
        }
    }
}
