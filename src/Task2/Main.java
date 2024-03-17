package Task2;
import java.io.*;
import java.util.*;

public class  Main{

    public static void main(String[] args) throws IOException {
        List<String> words = new ArrayList<>();
        List<String> maxLengthWords = new ArrayList<>();
        int maxLength = 0;

        BufferedReader reader = new BufferedReader(new FileReader("/media/alex/TOSHIBA EXT/prog/src/Task2/file.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] lineWords = line.split("\\s+");
            for (String word : lineWords) {
                words.add(word);
            }
        }

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                maxLengthWords.clear();
                maxLengthWords.add(word);
            } else if (word.length() == maxLength) {
                maxLengthWords.add(word);
            }
        }

        System.out.println("Максимальная длина: " + maxLength);
        for (String word : maxLengthWords) {
            System.out.println("Слово: " + word);
        }
    }
}

