package Homework;

import java.util.Scanner;

public class tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month;
        int year;

        System.out.println("Tính số ngày trong tháng.");
        System.out.print("Nhập tháng ban muốn kiểm tra: ");
        month = scanner.nextInt();

        if (month <= 0 || month >= 13) System.out.println("Không có tháng này trong năm.");
        else if (month % 2 == 0 && month < 7) {
            if (month == 2) {
                System.out.print("Nhập năm của tháng " + month + ": ");
                year = scanner.nextInt();
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    System.out.println("Tháng " + month + " có 29 ngày.");
                else System.out.println(month + " có 28 ngày.");
            } else System.out.println(month + " có 30 ngày");
        } else if (month % 2 != 0 && month < 8) System.out.println("Tháng " + month + " có 31 ngày.");
        else if (month >= 8 && month % 2 == 0) System.out.println("Tháng " + month + " có 31 ngày.");
        else System.out.println("Tháng " + month + " có 30 ngày.");
    }
}
