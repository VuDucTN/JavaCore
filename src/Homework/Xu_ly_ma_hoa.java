package Homework;

import java.util.Scanner;

public class Xu_ly_ma_hoa {
    public static void main(String[] args) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can ma hoa");
        String str = sc.nextLine();

        String output ="";
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            int index = a.indexOf(c);

            if (index == -1){
                output+=c;
            }else {
                output+=b.charAt(index);
            }
        }

        System.out.println("Ma hoa chuoi tren thanh: "+output);

    }
}
