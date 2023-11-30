package Homework;

import java.util.Scanner;

public class so_hoan_hao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tìm số hoàn hảo trong dãy số n  nhập từ bàn phìm.");
        int n;
        int sum;

        System.out.print("Nhập n số muốn tìm: ");
        n = scanner.nextInt();
        for (int i = 1; i < n; i++){
            sum = 0;
            for (int j = 1; j < i; j++){
                if(i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i){
                System.out.println(sum + " là số hoàn hảo.");
            }
        }
    }
}
