package Homework;

import java.util.Scanner;

public class lua_chon_tu_user {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        String name = "Mười vạn câu hỏi vì sao?";
        String auth = "Nguyễn Văn A";
        String publisher = "Kim Đồng";
        String price = "12.000 vnđ";

        System.out.println("Nhập chức năng tương ứng số bên dưới.");
        System.out.println("1. Hiển thị tên sách.");
        System.out.println("2. Hiển thị tên tác giả.");
        System.out.println("3. Hiển thị nhà xuất bản.");
        System.out.println("4. Hiển thị giá sách.");
        System.out.print("Nhập số bạn muốn: ");
        choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Tên sách: " + name);
                break;
            case 2:
                System.out.println("Tên tác giả: " + auth);
                break;
            case 3:
                System.out.println("Tên nhà xuất bản: " + publisher);
                break;
            case 4:
                System.out.println("Giá: " + price);
                break;
            default:
                System.out.println("Số vừa nhập không có trong lựa chọn.");
        }
    }
}
