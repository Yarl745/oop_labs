import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //
        final int C = 9213 % 3;
        final short a, b, n, m;
        double sum = 0;
        //
        System.out.print("Введите границы 1-ой суммы(через пробел): ");
        a = scanner.nextShort(); n = scanner.nextShort();
        System.out.print("Введите границы 2-ой суммы(через пробел): ");
        b = scanner.nextShort(); m = scanner.nextShort();
        //
        if (C < a || C > n) {
            for (short i = a; i <= n; i++) {
                for (short j = b; j <= m; j++) {
                    sum += (double)(i + j) / (i - C);
                }
            }
            System.out.println("Сумма = "+sum);
        }
        else System.out.println("Решений нет!");
    }
}

