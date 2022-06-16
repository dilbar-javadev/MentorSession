package mentorSession0608;

public class ThiefFox {

    /**
     * We have a fox group consists of 4 foxes. Unfortunately one of them stole an egg from chicken barn.
     * Luckily guard rooster have some info to identify the guilty fox.
     * Sheriff Dog got the info from the rooster. Sheriff Dog announced that;
     * thief fox had a black coat, a torch and 3 bags.
     * Find the suspect foxes, if a fox is cleared of charges write that also
     */

        public static void main(String[] args) {

            int foxID = 4;
            String result = checkIfThief(foxID);
            System.out.println(result);
        }

    public static String checkIfThief(int foxID) {
        String result = (ifWearsBlackCoat(foxID) && hasATorch(foxID) && bagCount(foxID) == 3)?
                "\uD83E\uDD8A Fox" + foxID + " is one of suspects! \uD83E\uDD14":
                "\uD83E\uDD8A Fox" +foxID + " cleared of charges!";
        return result;
    }

    public static boolean ifWearsBlackCoat(int foxID){
            if(foxID == 4){
                return false;
            }
            if(!coatColor(foxID).equals("BLACK")){
                return false;
            }
            return true;
}

    public static boolean hasATorch(int foxID){
            boolean result = true;
        switch(foxID){
            case 1: case 2: case 3: case 4:
                break;
        }
        return result;
    }

    public static String coatColor(int foxID){
        String result = "BLACK";
        switch(foxID){
            case 1: case 2: case 3:
                break;
            case 4:
                result = "GRAY";
                break;
        }
        return result;
    }

    public static int bagCount(int foxID){
        int bagCount = 0;
        switch(foxID){
            case 1:
                break;
            case 2:
                bagCount = 2;
                break;
            case 3: case 4:
                bagCount = 3;
                break;
        }
        return bagCount;
    }

}
