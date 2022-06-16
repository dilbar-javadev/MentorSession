package mentorSession0601;

public class FirstVowel{

    public static void main(String[] args) {

        String str = "bbddeeaffgi";

        int result = -1;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                if(str.charAt(i) == str.charAt(i+1)){
                    i++;
                    continue;
                }else if(str.charAt(i) != str.charAt(i-1)){
                    result = i;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}


/*

Question 1: Given a string, write a method to find the first non-repeating vowel(a,e, i,o,u) in it and return its index.
 If it doesn't exist, return -1. Assume that all the characters of the String are lowercase.
(Do not use String class functions other than charAt())

Ex1: bbddeeaffgi
output: 6

Ex2: aaabbbeeeoouu
output: -1

 */
