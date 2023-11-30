package Homework;

import java.util.Scanner;

public class kiem_tra_quy_trong_nam {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int month;

        System.out.println("Kiểm tra tháng thuộc quý mấy.");
        System.out.print("Nhập tháng muốn kiểm tra: ");
        month = scanner.nextInt();

        if (month > 0 && month <= 3 ) System.out.println("Thuộc quý I.");
        else if (month >= 4 && month <= 6) System.out.println("Thuộc quý II.");
        else if (month >= 7 && month <= 9) System.out.println("Thuộc quý III.");
        else if(month >=10 && month < 13 ) System.out.println("Thuộc quý IV.");
        else System.out.println("Không có tháng này trong năm.");
    }

}
