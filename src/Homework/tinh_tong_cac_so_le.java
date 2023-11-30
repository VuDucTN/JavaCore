package Homework;

import java.util.Scanner;

public class tinh_tong_cac_so_le {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int sum = 0;

        System.out.println("Tính tổng số lẻ từ 1 đến số nhập từ bàn phím.");
        System.out.print("Nhập số lẻ từ bàn phím: ");
        n = scanner.nextInt();

        while (n % 2 == 0){
            System.out.print("Nhập lại số lẻ : ");
            n = scanner.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                if (i == 3) {
//                    continue;
//                    break;
                }
                sum += i;
            }
        }
        System.out.print("Tổng số lẻ từ 1 đến " + n + " là: " + sum);
    }
}
