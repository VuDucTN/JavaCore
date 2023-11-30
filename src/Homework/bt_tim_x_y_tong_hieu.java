package Homework;

import java.util.Scanner;

public class bt_tim_x_y_tong_hieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x;
        float y;
        float sum;
        float difference;

        System.out.println("Tìm x, y khi biết tổng và hiệu.");
        System.out.print("Nhập tổng 2 số: ");
        sum = scanner.nextInt();
        System.out.print("Nhập hiệu 2 số: ");
        difference = scanner.nextInt();

        x = (sum + difference)/2;
            System.out.println("Giá trị x cần tìm: " + x);
        y = (sum - difference)/2;
        System.out.println("Giá trị y cần tìm: " + y);

    }
}
