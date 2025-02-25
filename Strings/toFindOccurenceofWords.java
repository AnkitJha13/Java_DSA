import java.util.Locale;

public class toFindOccurenceofWords {
    public static int characterOccurence(String name, char targetChar){

        name = name.toLowerCase(); // to make it work for both A and a
        targetChar = Character.toLowerCase(targetChar);  // not necessarily needed but if someone checks targetchar either for 'a' or 'A'
        int count = 0;
        for(char c : name.toCharArray()){
            if(c == targetChar){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String name = "Athena Mortal";
        char targetChar = 'a';

        int occurences = characterOccurence(name, targetChar);
        System.out.println("No of target char is --> " + occurences);
    }
}


// Output
No of target char is --> 3
