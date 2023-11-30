package Homework;

import java.util.Scanner;

public class kiem_tra_nam_nhuan {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int year;

        System.out.println("Kiểm tra năm nhuận.");
        System.out.print("Nhập vào năm bạn muốn kiểm tra: ");
        year = scanner.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) System.out.println("Năm " + year + " là năm nhuận.");
        else System.out.println("Năm " + year + " năm không nhuận.");
    }
}
