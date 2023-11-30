package Homework;

import java.util.Scanner;

public class Dem_chu_trong_chuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi bat ky: ");
        String str = sc.nextLine();

        int dem = 0;
        String[] m = str.split(" ");
        for (String pt : m){
            if (pt.equals("toi")){
                dem++;
            }
        }

        System.out.println("So lan toi xuat hien la : "+dem);
    }
}
