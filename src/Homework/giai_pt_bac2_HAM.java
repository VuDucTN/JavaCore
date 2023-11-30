package Homework;

import java.util.Scanner;

public class giai_pt_bac2_HAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.print("Nhap so a:");
        a = scanner.nextInt();
        System.out.print("Nhap so b:");
        b = scanner.nextInt();
        System.out.print("Nhap so c:");
        c = scanner.nextInt();

        System.out.println("Giai phuong trin bac 2.");
        GiaiPhuongTrinhBac2(a,b,c);
    }

    public static void GiaiPhuongTrinhBac2(int a, int b, int c){
        int delta = (b*b)-(4*a*c);

        if(delta < 0 ){
            System.out.println("Phuong trinh vo nghiem.");
        }else if (delta == 0){
            double x = (-b)/2*a;
            System.out.print("Phuong trinh co nghiem kep.");
            System.out.println("x1 = x2 = " + x);
        }else {
            double x1 = ((-b)+Math.sqrt(delta)) / 2 * a;
            double x2 = ((-b)-Math.sqrt(delta)) / 2 * a;
            System.out.println("Phuong trinh co 2 nghiem. x1 = " + x1 + " x2 = " + x2);
        }
    }
}
