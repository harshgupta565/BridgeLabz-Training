package Day1;

import java.io.*;
import java.util.*;

public class Java_Strings_Token {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        scan.close();

        s = s.trim();

        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.split("[ !,?._'@]+");

        System.out.println(tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}