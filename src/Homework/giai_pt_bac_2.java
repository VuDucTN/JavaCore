package Homework;

import java.util.Scanner;

public class giai_pt_bac_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;
        float delta;

        System.out.println("Tính phương trình bậc 2.");
        System.out.print("Nhập số a: ");
        a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        b = scanner.nextInt();
        System.out.print("Nhập số c: ");
        c = scanner.nextInt();

        delta = b*b - 4*a*c;

        if (delta < 0) System.out.println("Phương trình vô nghiệm.");
        else if (delta == 0) System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + (double) (-b)/2*a);
        else if (delta > 0) System.out.println("Phương trình có 2 nghiệm: \n x1 = " + ((-b) + Math.sqrt(delta))/2*a + "\n x2 = " + ((-b) - Math.sqrt(delta))/2*a);


    }
}
