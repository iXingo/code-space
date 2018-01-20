package cn.iwangxin.company.chubao.T2;


import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            int N = scanner.nextInt();

            int[] x = new int[N];
            int[] y = new int[N];
            int[] vx = new int[N];
            int[] vy = new int[N];

            for (int i = 0; i < N; i++) {
                x[i] = scanner.nextInt();
                y[i] = scanner.nextInt();
                vx[i] = scanner.nextInt();
                vy[i] = scanner.nextInt();
            }

            double minT = 0;
            double minValue = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                double maxDis = Integer.MAX_VALUE * -1;
                double maxT = 0;
                for (int j = 0; j < N && i != j; j++) {
                    double vector1 =1.00 *  (vx[i] - vx[j]);
                    double vector2 = 1.00 * (vy[i] - vy[j]);
                    double len1 = 1.00 * (x[i] - x[j]);
                    double len2 = 1.00 * (y[i] - y[j]);

                    double time = -(len1 * vector1 + len2 * vector2) / (vector1 * vector1 + vector2 * vector2);
                    if (time < 0) time = -time;
                    double dis = (vector1 * vector1 + vector2 * vector2) * time * time + 2 * (len1 * vector1 + len2 * vector2) * time + (len1 * len1 + len2 * len2);
                    if (dis < 0) continue;
                    if (dis > maxDis) {
                        maxDis = dis;
                        maxT = time;
                    }
                }
                if (maxDis > minValue) {
                    minValue = maxDis;
                    minT = maxT;
                }
            }
            DecimalFormat df = new DecimalFormat("#.00");

            String string2 = df.format(Math.sqrt(minValue));
            String string1 = df.format(minT);

            string2 = string2.startsWith(".0") ? ("0" + string2) : string2;
            string2 = string2.endsWith(".0") ? (string2 + "0") : string2;

            string1 = string1.endsWith(".0") ? (string1 + "0") : string1;
            string1 = string1.startsWith(".0") ? ("0" + string1) : string1;

            System.out.println(string1 + " " + string2);
        }
        scanner.close();
    }
}