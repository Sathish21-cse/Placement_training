package Weak_1.day_3;

import java.util.*;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (isPangram(str)) {
            System.out.println("The string is a pangram");
        } else {
            System.out.println("The string is NOT a pangram");
        }
    }

    public static boolean isPangram(String s) {
        s = s.toLowerCase();
        boolean[] seen = new boolean[26]; 

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }

        
        for (boolean b : seen) {
            if (!b) return false;
        }
        return true;
    }
}