package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListHomework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> quest = new ArrayList<>(List.of(
                "2 + 5 + 7 = ",
                "5 * 10 = ",
                "Can bac 2 cua 16",
                "12 % 2 = "
        ));

        ArrayList<Float> answer = new ArrayList<>(List.of(14f,50f,4f,0f));

        for (int i = 0; i < quest.size(); i++){
            System.out.println("Cau hoi so " + (i+1));
            System.out.println(quest.get(i));

            System.out.println("Nhap dap cua ban: ");
            Float dapAn = sc.nextFloat();

            if (dapAn.equals(answer.get(i))){
                System.out.println("Dap an chinh xac!");
            }else {
                System.out.println("Dap an sai!");
                System.out.println("Dap an dung la: " + answer.get(i));
            }
            System.out.println("===============");
        }
    }
}
