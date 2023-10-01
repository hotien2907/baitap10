package baitap.baitap5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputString = "chúc mừng năm mới hà hi hùng hu";

        List<String> words = new ArrayList<>();
        for (String word : inputString.split(" ")) {
            words.add(word);
        }

        List<String> shortestWords = new ArrayList<>();

        int minLength = words.get(0).length();
        for (String word : words) {
            int wordLength = word.length();
            if (wordLength < minLength) {
                minLength = wordLength;
                shortestWords.clear();
                shortestWords.add(word);
            } else if (wordLength == minLength) {
                shortestWords.add(word);
            }
        }

        // In ra kết quả
        System.out.println("Chuỗi ngắn nhất:");
        for (String word : shortestWords) {
            System.out.println(word);
        }
    }
}
