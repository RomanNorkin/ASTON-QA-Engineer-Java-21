package lesson13;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String[] words = {"Дерево", "Озеро", "Дерево", "Дом", "Дом", "Мост", "Кот", "Болото", "Болото", "Шрек", "Дерево", "Дом",};

        HashSet<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }
        System.out.println("Уникальные слова: \n");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
        HashMap<String, Integer> count = new HashMap<>();
        for (String word : words) {
            if (count.containsKey(word)) {
                count.put(word, count.get(word) + 1);
            } else {
                count.put(word, 1);
            }
        }
        System.out.println("\nСколько раз повторяются слова?\n");
        for (String word : count.keySet()) {
            System.out.println(word + ": " + count.get(word));
        }
    }
}