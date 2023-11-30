package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListHomework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong mang");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0;i<n;i++){
            System.out.println("Nhap phan tu tai vi tri " + i);
            int value = sc.nextInt();
            list.add((int) Math.pow(value,2));
        }

        System.out.println("Mang duoc khoi tao: "+list);
        System.out.println("So phan tu lon hon 50 trong mang la: "+checkArray(list));
    }

    public static int checkArray(ArrayList<Integer> arr){

        int dem = 0;

        for (int i = 0; i < arr.size(); i++){
            if(arr.get(i) > 50){
                dem++;
            }
        }

        return dem;
    }
}
