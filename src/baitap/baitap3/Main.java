package baitap.baitap3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //cách 1:
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);
        Collections.sort(numbers);
        System.out.println("sắp xếp tăng dần"+numbers);
        Collections.reverse(numbers);
        System.out.println("sắp  xếp giảm dần " + numbers);

        //cách 2
        sortDescending(numbers);
    }//cách 2
    public static void sortDescending(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
