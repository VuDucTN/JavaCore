package Homework;

import java.util.Scanner;

public class cat_duong_link {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao duong path: ");
        String path = sc.nextLine();

        int cutLastPath = path.lastIndexOf("\\");
        String fileName = path.substring(cutLastPath+1);
        System.out.println(fileName);

        int indexDot = fileName.lastIndexOf(".");
        String name = fileName.substring(0,indexDot);
        System.out.println(name);

    }
}
