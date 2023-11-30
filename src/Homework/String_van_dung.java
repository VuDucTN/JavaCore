package Homework;

import java.util.Scanner;

public class String_van_dung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi bat ky");

        String str = sc.nextLine();
        int demSo = 0;
        int demStrThuong = 0;
        int demStrHoa = 0;
        int demSpace = 0;

        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if (Character.isDigit(c)==true){
                demSo++;
            }
            if (Character.isLowerCase(c)==true){
                demStrThuong++;
            }
            if (Character.isUpperCase(c)){
                demStrHoa++;
            }
            if (Character.isWhitespace(c)){
                demSpace++;
            }
        }
        System.out.println("So chu so trong chuoi: "+demSo);
        System.out.println("So ky tu thuong trong chuoi: "+demStrThuong);
        System.out.println("So ky tu hoa trong chuoi: "+demStrHoa);
        System.out.println("So khoang trang trong chuoi: "+demSpace);

    }
}
