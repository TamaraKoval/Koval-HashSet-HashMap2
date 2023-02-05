import checkers.WordsChecker;

public class Main {
    public static void main(String[] args) {
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, " +
                "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat " +
                "nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
                "officia deserunt mollit anim id est laborum.";

        WordsChecker checker = new WordsChecker(loremIpsum);
        System.out.println(checker.hasWord("ut")); // true, программа работает корректно
        System.out.println(checker.hasWord("Toma")); // false, программа работает корректно

        checker.setText("Ехал Грека через реку");
        System.out.println(checker.hasWord("грека")); // true, программа работает корректно
        System.out.println(checker.hasWord("рак")); // false, программа работает корректно
    }
}
