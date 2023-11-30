package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong mang");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0;i<n;i++){
            System.out.println("Nhap phan tu tai vi tri " + i);
            int value = sc.nextInt();
            while (value <= 0 || value > 100){
                System.out.println("Nhap lai. Phan tu chi duoc chap nhan tu 1 - 100");
                System.out.println("Nhap lai phan tu tai vi tri " + i);
                value = sc.nextInt();
            }
            list.add(value);
        }


        System.out.println("Mang duoc khoi tao: "+list);
    }
}
