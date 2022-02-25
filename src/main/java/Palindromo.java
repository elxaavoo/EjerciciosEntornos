import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        System.out.println(isPalindrome("pee.p"));
    }
    public static boolean isPalindrome(String palabra){
        String removedSimbols = removeSimbols(palabra);
        String reverserdText = getPalindrome(removedSimbols);
        return (comprovePalindrome(reverserdText));

    }
    public static boolean comprovePalindrome(String text){
        String removeSimbols = removeSimbols(text);
        String reverseText = getPalindrome(removeSimbols);
        if (text.length()==0 || text.length() == 1)
            return true;
        return text.equals(reverseText);
    }

    public static String getPalindrome(String text){
        String reverseText = "";
        for (int i = text.length()-1; i >= 0; i--)
            reverseText+=text.charAt(i);
        return reverseText;
    }
    public static String removeSimbols(String text){
        String out = "";
        List<Character> simbolos = new ArrayList<>();
        simbolos.add('/');
        simbolos.add('(');
        simbolos.add(')');
        simbolos.add('-');
        simbolos.add('.');
        simbolos.add('%');
        simbolos.add(',');
        simbolos.add(':');
        simbolos.add(';');
        simbolos.add('?');
        simbolos.add('¿');
        simbolos.add('!');
        simbolos.add('|');
        for (int i = 0; i < text.length(); i++){
            if (simbolos.contains(text.charAt(i)))
                out+="";
            else
                out+=text.charAt(i);
        }
        return out;
    }
}
