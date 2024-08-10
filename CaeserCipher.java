import java.util.*;


public class CaeserCipher {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String w = s.next();
        int k = s.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; ++i) {
            sb.append(encryptChar(w.charAt(i), k));
        }

        System.out.println(sb.toString());
    }

    private static char encryptChar(char c, int k) {
        if(!Character.isAlphabetic(c)) return c;
        int base = Character.isLowerCase(c) ? 'a' : 'A';
        return (char)((c + k - base) % 26 + base);
    }
}