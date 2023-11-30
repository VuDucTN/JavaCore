package Homework;

import java.util.Scanner;

public class xep_loai_hs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float score;
        String rating;

        System.out.print("Nhập vào số điểm của bạn: ");
        score = scanner.nextFloat();

        rating = score > 10 ? "Vượt quá thang điểm 10." :
                score <= 10 && score >= 8 ? "Xếp loại của bạn là : Giỏi" :
                        score < 8 && score >= 6.5 ? "Xếp loại của bạn là : Khá" :
                                score < 6.5 && score >= 5 ? "Xếp loại của bạn là : Trung bình" : "Xếp loại của bạn là : Yếu";
        System.out.println(rating);

    }
}
