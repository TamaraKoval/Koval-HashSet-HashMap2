package checkers;

import java.util.HashSet;
import java.util.List;

public class WordsChecker {
    private HashSet<String> textSet;

    public WordsChecker(String text) {
        this.textSet = new HashSet<>(List.of(text.toLowerCase().split("\\P{IsAlphabetic}+")));
    }

    public void setText(String newText) {
        this.textSet = new HashSet<>(List.of(newText.toLowerCase().split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String word) {
        return textSet.contains(word);
    }
}
