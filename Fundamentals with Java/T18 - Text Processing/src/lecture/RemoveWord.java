package lecture;

public class RemoveWord {
    public static void main(String[] args) {

        String text = "the quick brawn fox jumps over the lazy dog";

        String removeWord = "the";//"fox"
        int removeIndex = text.indexOf(removeWord);

        while(removeIndex != -1){
            String firstPart  = text.substring(0, removeIndex);
            String secondPart = text.substring(removeIndex + removeWord.length());

            text = firstPart + secondPart;
            removeIndex = text.indexOf(removeWord);
        }
        System.out.println(text);
    }
}