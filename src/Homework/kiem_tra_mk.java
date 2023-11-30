package Homework;

import java.util.Scanner;

public class kiem_tra_mk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mk = "";

        while (true){
                System.out.println("Nhap mat khau.");
                System.out.println("Bao gom ca chu cai va so.");
                System.out.println("Do dai phai lon hon 6 ky tu.");
                String newMk = sc.nextLine();

                if (checkMK(newMk)){
                    mk = newMk;
                    System.out.println("Mat khau tao thanh cong!");
                    break;
                }else {
                    System.out.println("Mat khau khong hop le");
                }
        }

        String loginPass ="";
        int count = 0;
        while (true){
            System.out.println("Nhap mat khau: ");
            loginPass = sc.nextLine();
            if (loginPass.equals(mk)){
                System.out.println("Mat khau hop le!");
                break;
            }else {
                count++;
            }

            if (count == 5){
                System.out.println("Nhap sai mk qua 5 lan. Tai khoan bi khoa!");
                break;
            }
        }
    }
    public static boolean checkMK(String password){
        if (password.length()<6){
            return false;
        }

        boolean hasLetter = false;
        for(char c : password.toCharArray()){
            if (Character.isLetter(c)){
                hasLetter = true;
                break;
            }
        }
        if (!hasLetter) //hasLetter == false
            return false;

        boolean hasNumber = false;
        for(char c : password.toCharArray()){
            if (Character.isDigit(c)){
                hasNumber = true;
                break;
            }
        }

        if (!hasNumber)
            return false;

        return true;
    }
}
