package Homework;

import java.util.Scanner;

public class tinh_tong_gia_thua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int factorial = 1;
        int sum = 0;

        System.out.println("Tính tổng các giai thừa từ 1 đến n.");
        System.out.print("Nhập số tự nhiên n: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                factorial *= j;
            }
            sum += factorial;
            factorial = 1;
        }
        System.out.print("Tổng của các giai thừ từ 1 đến "+ n + " là: " + sum);

    }
}
