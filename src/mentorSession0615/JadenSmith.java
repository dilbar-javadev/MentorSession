package mentorSession0615;

import java.util.Arrays;

public class JadenSmith {

    public static void main(String[] args) {

        String philosophy = "How can mirrors be real if our eyes aren't real";
        System.out.println(toJaden(philosophy));

    }

    private static String toJaden(String philosophy) {

        String[] array = philosophy.split(" ");

        String result = "";

        if(!(philosophy.isEmpty() || philosophy == null)){

            for (int i = 0; i < array.length; i++) {
                array[i] = array[i].substring(0,1).toUpperCase() + array[i].substring(1);
                result += array[i] + " ";
            }
        }
        return result;
    }
}
