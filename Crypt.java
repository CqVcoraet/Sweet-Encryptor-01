// Imported Packages
import java.util.Arrays;

public class Crypt {
    private String text;
    private char[] charArr;
    private String key;

    public Crypt(String text) {
        this.text = text;
        this.charArr = this.text.toCharArray();
        this.key = initKey(this.charArr);
    }

    private String initKey(char[] charArr) {
        String key = "";
        String[] randChars = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "[", "]", "{", "}", ";", ":", "'", "\"", ",", "<", ".", ">", "/", "?", "|", "~", "`"};
        for (int i = 0; i < charArr.length; i++) {
            key += randChars[(int) (Math.random() * randChars.length)]; 
            key += randChars[(int) (Math.random() * randChars.length)];
            key += String.valueOf((int)(Math.random() * 1000));
        }
        return key;
    }
    
    public String getKey() {
        return key;
    }
}
