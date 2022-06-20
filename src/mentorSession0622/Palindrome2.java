package mentorSession0622;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome2 {

    public static void main(String[] args) {

        String[] array = {"abc", "car", "ada", "racecar", "cool"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list.removeIf(p -> !isPalindrome(p)));
    }

    public static boolean isPalindrome(String word){
        String reverse = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
            reverse += word.charAt(i);
        }
        if(word.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }
}
