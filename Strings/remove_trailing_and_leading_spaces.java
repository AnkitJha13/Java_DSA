public class RemoveSpaces {
    public static String removeLeadingTrailingSpaces(String s) {
        int start = 0, end = s.length() - 1;

        // Find first non-space character from the start
        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }

        // Find first non-space character from the end
        while (end >= start && s.charAt(end) == ' ') {
            end--;
        }

        // Create a substring without leading and trailing spaces
        String result = "";
        for (int i = start; i <= end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "   Hello World   ";
        System.out.println("Before: \"" + str + "\"");
        System.out.println("After:  \"" + removeLeadingTrailingSpaces(str) + "\"");
    }
}

// Output
Before: "   Hello World   "
After:  "Hello World"
