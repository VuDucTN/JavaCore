package Homework;

import java.util.Scanner;

public class tim_so_nguyen_to {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            int n;
            int a = 0;
            System.out.println("Tìm số nguyên tố.");
            System.out.print("Nhập số n cần tìm: ");
            n = scanner.nextInt();

            while ( n <= 1){
                System.out.println("Nhập n lớn hơn 1: ");
                n = scanner.nextInt();
            }
            for (int i = 1; i <= n; i++){
                if (n % i == 0){
                    a++;
                }
            }

            if (a == 2){
                System.out.println("Đây là số nguyên tố.");
            }else System.out.println("Đây không phải là số nguyên tố.");

            System.out.println("======================================================");
            System.out.println("Có muốn tiếp tục không?");
            System.out.println("Nhấn x nếu muốn thoát.");
            String choice = new Scanner(System.in).nextLine();
            if (choice.equals("x") || choice.equals("X")){
                break;
            }
        }
    }
}
