package lecture;

public class ReplaceText {
    public static void main(String[] args) {

        String text = "the quick brown fox jumps over the lazy dog";
        String[] bannedWords = new String[]{"fox", "the"};

        for (String bannedWord : bannedWords) {
            String censored = repeat("*", bannedWord.length());
            text = text.replace(bannedWord, censored);
        }
        System.out.println(text);
    }

    private static String repeat(String s, int length) {
        String replacement = "";
        for (int i = 0; i < length; i++) {
            replacement += s;
        }
        return replacement;
    }
}