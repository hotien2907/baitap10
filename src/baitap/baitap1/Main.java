package baitap.baitap1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int numberOf= (int) (Math.random() * 10) + 1;
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < numberOf; i++) {
            int numberRandom = (int) (Math.random()*100);
            integerList.add(numberRandom);

        }
        System.out.println("List số ngẫu nhiên là: ");
        System.out.println(integerList);

        int max = Collections.max(integerList);
        System.out.println("giá trị lớn nhất trong list là : " +max);
    }
}
