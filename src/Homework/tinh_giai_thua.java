package Homework;

import java.util.Scanner;

public class tinh_giai_thua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính giai thừa của một số nguyên");
        int n;
        int factorial = 1;

        System.out.print("Nhập số tự nhiên :");
        n = scanner.nextInt();

        //sử dụng vòng lặp for
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        System.out.println("Giai thừa của " + n + "! là: " + factorial + " for");

        //sử dụng vòng lặp while
        while (factorial < n){
            factorial *= n;
            factorial++;
        }
        System.out.println("Giai thừa của " + n + "! là: " + factorial + " while");
    }
}
