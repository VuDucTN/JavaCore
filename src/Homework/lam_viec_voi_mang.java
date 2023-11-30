package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class lam_viec_voi_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu trong mang: ");
        int n = sc.nextInt();
        int[] N = new int[n];
        System.out.println("----------------");

        System.out.println("Nhap vao cac gia tri cua tung phan tu cua mang.");
        for (int i = 0; i < N.length; i++){
            System.out.print("N["+i+"]:");
            N[i] = sc.nextInt();
        }
        System.out.println("Mang da tao:");
        System.out.println(Arrays.toString(N));
        System.out.println("----------------");

        System.out.println("Dao nguoc thu tu trong mang");
        dao_nguoc_mang(N);
        System.out.println("----------------");

        System.out.println("Sap xep thu tu trong mang");
        Arrays.sort(N);
        System.out.println(Arrays.toString(N));
        System.out.println("----------------");

        System.out.println("Tong phan tu trong mang");
        tinh_tong_phan_tu_trong_mang(N);
        System.out.println("----------------");

        System.out.println("Kiem tra phan tu co trong mang khong");
        System.out.println("Nhap vao phan tu muon kiem tra");
        int a = sc.nextInt();
        kiem_tra_phan_tu_trong_mang(N, a);
    }

    public static void dao_nguoc_mang(int[] N){
        for (int i = 0, j = N.length - 1; i < j; i++, j--){
            int temp = N[j];
            N[j] = N[i];
            N[i] = temp;

        }
        System.out.println(Arrays.toString(N));
    }

    public static void tinh_tong_phan_tu_trong_mang(int[] N){
        int sum = 0;
        for (int i = 0; i < N.length; i++){
            sum = N[i] + sum;
        }
        System.out.println(sum);
    }

    public static void kiem_tra_phan_tu_trong_mang(int[] N, int a){
        int index = 0;
        boolean check = false;
        for (int i = 0; i< N.length; i++){
            if (N[i] == a){
                index = i;
                check = true;
            }
        }
        if (check){
            System.out.println("Co ton tai phan tu "+a+" trong mang tai vi tri N["+index+"]");
        }else {
            System.out.println("Khong ton tai phan tu "+a+" trong mang");
        }
    }


}
