package Homework;

import java.util.Scanner;

public class tach_so_va_chu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi bat ky:");
        String str = sc.nextLine();

        StringBuilder num = new StringBuilder();
        StringBuilder string = new StringBuilder();

        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if (Character.isLetter(c)){
                string.append(c);
            }else if (Character.isDigit(c)){
                num.append(c);
            }
        }
        System.out.println("Chuoi ki tu : "+string);
        System.out.println("So : "+num);
    }
}
