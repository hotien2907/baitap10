package baitap.baitap4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String inputString = "Rekkei Academy để nông dân biết code";

        List<String> stringList = new ArrayList<>();


        String[] str = inputString.split(" ");
        for (String word : str) {
            stringList.add(word);
        }


        for (String word : stringList) {
            if (word.length() > 3) {
                System.out.println(word);
            }
        }
    }
}