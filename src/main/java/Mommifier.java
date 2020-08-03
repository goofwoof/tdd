import java.util.Arrays;

public class Mommifier {
    private static final char[]  vowels = {'a', 'e', 'i', 'o', 'u'};
    private static final String MOMMY = "mommy";

    public String insertMommy(String string) {
        if(string == null || string.isEmpty()) {
            throw new RuntimeException("input is wrong");
        }
        String[] splitResult = string.split("");
        double count = (double) Arrays.stream(splitResult).filter(onechar ->isVowel(onechar.charAt(0))).count();
        if(count/string.length()<=0.3){
            return string;
        }
        StringBuilder stringBuffer = new StringBuilder();
        Arrays.stream(splitResult).forEach(onechar->{
            if (isVowel(onechar.charAt(0)) && stringBuffer.length() > 0 && isVowel(stringBuffer.charAt(stringBuffer.length()-1))) {
                stringBuffer.append(MOMMY);
            }
            stringBuffer.append(onechar);
        });
        return stringBuffer.toString();
    }

    private boolean isVowel(char charAt) {
        for (char vowel : vowels) {
            if (vowel == charAt) {
                return true;
            }
        }
        return false;
    }
}
