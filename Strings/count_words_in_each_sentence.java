public class FindOccurrenceOfWords {
    public static int wordOccurrence(String text, String targetWord) {
        text = text.toLowerCase();     // Convert to lowercase for case-insensitive comparison
        targetWord = targetWord.toLowerCase();

        String[] words = text.split("\\s+");  // Splitting sentence into words

        int count = 0;
        for (String word : words) {
            if (word.equals(targetWord)) {   // Check if word matches target word
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "Java Game java Mortal";
        String targetWord = "java";

        int occurrences = wordOccurrence(text, targetWord);
        System.out.println("No of occurrences of '" + targetWord + "' is --> " + occurrences);
    }
}

// Output 
No of occurrences of 'java' is --> 2
