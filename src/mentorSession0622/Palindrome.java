package mentorSession0622;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String words = input.nextLine();
        System.out.println("If it's palindrome: " + ifPalindrome(words));

    }

    private static boolean ifPalindrome(String words) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(words.toLowerCase().split("")));
        list.removeIf(p -> p.equals(" "));

        ArrayList<String> firstHalf = new ArrayList<>();
        for (int i = 0; i < list.size() / 2; i++) {
            firstHalf.add(list.get(i));
        }

        ArrayList<String> lastHalf = new ArrayList<>();
        for (int i = list.size() / 2 + 1; i < list.size(); i++) {
            lastHalf.add(list.get(i));
        }

        Collections.reverse(lastHalf);

        if(firstHalf.equals(lastHalf) || words.equals("") || words.equals(" ")){
            return true;
        }else{
            return false;
        }
    }
}
