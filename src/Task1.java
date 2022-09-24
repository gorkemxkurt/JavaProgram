import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("ВАРИАНТ 13");
        System.out.println("ВОПРОС 5");
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        double A = scanner.nextDouble();
        double C;
        if (A >= -4)
            C = Math.sqrt(1 + A * A) / (Math.abs(A - 1) + 1);
        else if (-10 < A & A < -4)
            C = Math.sqrt(Math.abs(A - 5));
        else
            C = Math.exp(1 / -A);
        System.out.println(C);

        System.out.println("ВОПРОС 3");
        System.out.println("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();
        System.out.print("z = ");
        int z = scanner.nextInt();
        int max = 0;
        if (x >= y && x >= z) max = x;
        if (y >= x && y >= z) max = y;
        if (z >= x && z >= y) max = z;
        if (max % 2 == 0) {
            System.out.println(x * x);
            System.out.println(y * y);
            System.out.println(z * z);
        } else
            System.out.println(x + y);

        System.out.println("ВОПРОС 2");
        System.out.println("Пожалуйста, введите 3 номера");
        System.out.println("a =");
        int a = scanner.nextInt();
        System.out.println("b =");
        int b = scanner.nextInt();
        System.out.println("c =");
        int c = scanner.nextInt();
        int числа1, числа2;
        числа1 = (a * 100) + (b * 10) + (c * 1);
        System.out.println("номер, который вы ввели : " + числа1);
        числа2 = (c * 100) + (b * 10) + (a * 1);
        System.out.println("желаемое число : " + числа2);

        System.out.println("ВОПРОС 1");
        System.out.println("Введите значение точки X: ");
        double X = scanner.nextDouble();
        System.out.println("Введите значение точки Y: ");
        double Y = scanner.nextDouble();
        System.out.println("Введите значение точки Z: ");
        double Z = scanner.nextDouble();
        double XZ;
        double YZ;
        XZ = Math.abs(X - Z);
        System.out.println("XZ : ");
        YZ = Math.abs(Y - Z);
        System.out.println("YZ : ");
        double sum;
        sum = (XZ + YZ);
        System.out.println("Сумма XZ + YZ = " + sum);

        System.out.println("ВОПРОС 6");
        int K = scanner.nextInt();
        int us1 = 5;
        int us2 = 4;
        int us3 = 3;
        int us4 = 2;

        long sonuc = 1;

        for (; us1 != 0; --us1) {
            sonuc *= x;
        }
        long sonuc2 = 1;

        for (; us2 != 0; --us2) {
            sonuc2 *= x;
        }
        long sonuc3 = 1;

        for (; us3 != 0; --us3) {
            sonuc3 *= x;
        }
        long sonuc4 = 1;

        for (; us4 != 0; --us4) {
            sonuc4 *= x;
        }
        System.out.println((7 * sonuc) + (sonuc2) - (2 * sonuc3) + (11 * sonuc4) - (2 * x) + 3);


        int celcius = 0;
        while (celcius <= 100) {
            System.out.println("F = " + 9.0 / 5.0 * celcius + 32.0);
            celcius = celcius + 10;
        }

        double M = 0;
        do {
            System.out.println(Math.log(M + 1) * Math.sin(M));
            M = M + 0.5;
        } while (M <= 5);
/*
        System.out.println("пожалуйста ввдите номер темпуратура");
        double tem = scanner.nextDouble();
        if (tem <32 & tem>42);
        System.out.println("МЕРТВ");

        else if (32 < tem & tem < 42)
        System.out.println("МЕРТВ");


        */
        System.out.println("Number");
        double tem = scanner.nextDouble();

        if (tem < 32)  {
            System.out.println("dead");}
        else if (tem < 42){
        System.out.println("dead");}
        else if (32 < tem & tem < 36.5) {
                System.out.println("ill");
            } else if (tem == 36.5) {
                System.out.println("dont ill");
            } else if (36.5 < tem & tem < 42) {
                System.out.println("ill");
            }


        }
}