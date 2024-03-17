import java.util.Locale;

public class practise_set_03 {
    public static void main(String[] args) {
        String word = "   MYSORE   ";
        /*String lowerCaseWord = word.toLowerCase();
        System.out.println(lowerCaseWord);*/

        String underScoredWord = word.replace(" ","_");
        System.out.println(underScoredWord);
    }
}
