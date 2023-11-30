package List;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class LinkedList {
    public static void main(String[]args){
        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};

        List<String> list = new java.util.LinkedList<>();
        List<String> list2 = new java.util.LinkedList<>();

        for (int i = 0; i < colors.length; i++) {
            list.add(colors[i]);
            list2.add(colors2[i]);
        }

        list.addAll(list2);
        list2 = null;

        System.out.println("Hien thi danh sach list");
        for (String color : list) {
            System.out.print(color + "\t");
        }
        System.out.println("\n------------------------------------------");

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String str = listIterator.next();
            listIterator.set(str.toUpperCase());
        }
        System.out.println("Hien thi danh sach list");
        for (String color : list) {
            System.out.print(color + "\t");
        }
        System.out.println("\n------------------------------------------");

        list.subList(4, 7).clear();
        System.out.println("Hien thi danh sach list sau khi bo 4 va 6");
        System.out.println(list);
        System.out.println("\n------------------------------------------");

        listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + "\t");
        }
        System.out.println("\n------------------------------------------");
        Collections.reverse(list);
        System.out.println(list);
    }
}
