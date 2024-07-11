package src.problem4;
import java.util.List;

public class WordCounter {

    public int countWords(List<String> words, char c, char d, int len) {
        return (int) words.stream()
                .filter(word -> word.length() == len)
                .filter(word -> word.indexOf(c) >= 0)
                .filter(word -> word.indexOf(d) == -1)
                .count();
    }

    public static void main(String[] args) {
        WordCounter wc = new WordCounter();
        List<String> words = List.of("apple", "banana", "cherry", "date", "fig", "grape");
        int count = wc.countWords(words, 'c', 'd', 6);
        System.out.println("Count of words: " + count);
    }
}




