package Homework;

import java.util.Scanner;

public class tinh_tong_so_chan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int sum = 0;

        System.out.println("Tính tổng các số chẵn từ 0 đến số tự nhiên được nhập từ bàn phím");
        System.out.printf("Nhập số tự nhiên chẵn :");
        a = scanner.nextInt();

        while (a % 2 != 0) {
            System.out.print("Nhập lại số chẵn :");
            a = scanner.nextInt();
        }

        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.print("Tổng các số chẵn từ 0 đến " + a + " là: " + sum);

    }
}
