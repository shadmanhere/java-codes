import java.awt.*;
import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s1 =  sc.nextLine(); //"team how are doing"
        String[] words=s1.split(" ");
        String result = "";
        for(int i=0;i < words.length;i++ ){
            int wordmid = words[i].length() / 2;
            if(words[i].length() % 2 != 0) {
                result += words[i].charAt(wordmid);
            }
            else {
                String letter1 = String.valueOf(words[i].charAt(wordmid-1));
                String letter2 = String.valueOf(words[i].charAt(wordmid));
                result += letter1 + letter2;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
