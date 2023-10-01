package baitap.baitap2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumber= new ArrayList<>();
        listNumber.add(1);
        listNumber.add(2);
        listNumber.add(3);
        listNumber.add(4);
        List<Integer> reversedList = new ArrayList<>();
        for (int i = listNumber.size()-1; i >=0 ; i--) {
             reversedList.add(listNumber.get(i));
        }

        System.out.println("dah sách ban đầu là: " + listNumber);
        System.out.println("dah sách sau khi đảo ngược: " + reversedList);
    }
}
