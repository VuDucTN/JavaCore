package Homework;

public class chuan_hoa_chuoi {
    public static void main(String[] args) {
        String input = "   HÔm nAy tôI đi HỌC  ";
        System.out.println(chuanhoa(input));

    }

    public static String chuanhoa(String input){
        input = input.trim(); //xóa khoảng trắng trong chuỗi
        String[] words = input.split("\\s"); //tách chuỗi ngăn cách bởi khoảng trắng đựa vào mảng
        for (int i=0; i < words.length; i++){
            words[i] = words[i].toLowerCase(); //chuyển về ký tự thường
            String firstChar = words[i].substring(0,1); //lấy ra ký tự đầu tiên
            firstChar = firstChar.toUpperCase(); //viết hoa ký tự đầu tiên
            words[i] = firstChar + words[i].substring(1); //thay các ký tự đã viết hoa
        }
        return String.join(" ", words); //gộp các từ trong mảng
    }
}
