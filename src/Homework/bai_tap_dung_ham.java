package Homework;

import java.util.Scanner;

public class bai_tap_dung_ham {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        String c;

        System.out.println("Nhap so a: ");
        a = scanner.nextInt();
        System.out.println("Nhap so b: ");
        b = scanner.nextInt();
        System.out.println("Chon phep tinh + , -, *, /");
        c = scanner.next();

        Choice(a,b,c);
    }

    public static void Choice(int a, int b, String c){
        switch(c){
            case "+":
                System.out.println(Tong(a,b));
                break;
            case "-":
                System.out.println(Hieu(a,b));
                break;
            case "*":
                System.out.println(Tich(a,b));
                break;
            case "/":
                System.out.println(Thuong(a,b));
                break;
            default:
                System.out.println("Nhap sai phep tinh");
                break;
        }
    }

    public static int Tong(int a, int b){
        int Sum = a + b;
        return Sum;
    }

    public static int Hieu(int a, int b){
        int Hieu = a - b;
        return Hieu;
    }

    public static int Tich(int a, int b){
        int Tich = a * b;
        return Tich;
    }

    public static double Thuong(double a, double b){
        double Thuong = 0;
        if (b==0){
            System.out.println("b khong the bang 0");
        }else {
            Thuong = a / b;
        }
        return Thuong;
    }
}
