package Homework;

import java.util.Scanner;

public class so_chia_het_cho_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tìm số chia hết cho n từ 10 đến 50.");

        int a = 0;
        int n;

        System.out.printf("Nhập số tự nhiên n: ");
        n = scanner.nextInt();

        System.out.println("Số chia hết cho " + n + " là : ");
        for (int i = 10; 10 <= i && i <= 50 ; i++){
                if (i % n == 0) {
                    a = i;
                    System.out.print(a + ", ");
                }
        }
    }
}
