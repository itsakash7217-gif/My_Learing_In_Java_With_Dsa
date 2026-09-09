package Accenture;
import java.util.*;
public class EncryptionString {
    static void main() {
        Scanner sc= new Scanner(System.in);
        String sentence = sc.nextLine();
        sentence=sentence.replaceAll("\\s+","");
        int row = (int) Math.floor(Math.sqrt(sentence.length()));
        int col = (int) Math.ceil(Math.sqrt(sentence.length()));
    System.out.print(row+" "+col);
        if (row * col < sentence.length()) {
            row = col;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < col; i++) {
            for (int j = i; j < sentence.length(); j += col) {
                ans.append(sentence.charAt(j));
            }
            ans.append(" ");
        }
        System.out.println(ans.toString().trim());

    sc.close();
    }
}
//if man was meant to stay on the ground god would have given us roots output - imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau
//have a nice day output - hae and via ecy
