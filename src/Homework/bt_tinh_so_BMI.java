package Homework;

import java.util.Scanner;

public class bt_tinh_so_BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float height;
        float weight;
        float bmi;

        System.out.println("Tính chỉ số BMI.");
        System.out.print("Nhập chiều cao (m): ");
        height = scanner.nextFloat();
        System.out.print("Nhập cân nặng (kg): ");
        weight = scanner.nextFloat();

        bmi = weight/(height*height);

        System.out.println("Chỉ số BMI của bạn là : " + bmi);
        if(bmi >= 35) System.out.println("Thân hình quá béo.");
        else if (bmi >= 30 && bmi < 35) System.out.println("Thân hình béo.");
        else if (bmi >= 25 && bmi < 30) System.out.println("Thân hình hơi béo.");
        else if (bmi >= 18.5 && bmi < 25) System.out.println("Thân hình bình thường.");
        else if (bmi >= 16 && bmi < 18.5) System.out.println("Thân hình hơi gầy.");
        else if (bmi >= 15 && bmi < 16) System.out.println("Thân hình gầy.");
        else System.out.println("Thân hình quá gầy.");
    }
}
