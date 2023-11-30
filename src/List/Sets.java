package List;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> hashsetInteger = new HashSet<>();
        hashsetInteger.add(3);
        hashsetInteger.add(39);
        hashsetInteger.add(0);
        hashsetInteger.add(8);
        hashsetInteger.add(8);
        hashsetInteger.add(2);
        hashsetInteger.add(9);

        System.out.println("Các phần tử có trong hashsetInteger: ");
        System.out.println(hashsetInteger);
    }
}
