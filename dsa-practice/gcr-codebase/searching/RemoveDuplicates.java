package searching;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet();
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            char ch = Character.toLowerCase(chr);

            if (!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}

