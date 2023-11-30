package List;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

/*
Viết chương trình nhập vào 10 phần tử cho 1 ArrayList chứa các số nguyên dương.
Sau đó loại bỏ các phần tử trùng nhau trong ArrayList đó và hiển thị lại ArrayList này.
 */
public class ArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listNumber = new ArrayList<>();
        int numbers;

        for (int i = 0; i < 3; i++){
            numbers = sc.nextInt();
            listNumber.add(numbers);
        }

        System.out.println(listNumber);
        ArrayList<Integer> listNumberTemp = new ArrayList<>();
        for (int i = 0; i < listNumber.size(); i++) {
            if (!listNumberTemp.contains(listNumber.get(i))){
                listNumberTemp.add(listNumber.get(i));
            }
        }

        System.out.println(listNumberTemp);
        listNumber.clear();
        listNumber.addAll(listNumberTemp);

        //Cach 1: vong lap
        int max = 0;
        for (int number : listNumber){
            if(number > max){
                max = number;
            }
        }
        System.out.println("So lon nhat trong phan tu: " + max);

        //Cach 2 su dung Collections
        System.out.println("So lon nhat trong phan tu: " + Collections.max(listNumber));

        int sum = 0;
        for (int number : listNumber) {
            sum += number;
        }
        System.out.println("Tong phan tu trong mang: " + sum);

        
    }
}
