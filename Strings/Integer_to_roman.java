class Solution {
    public String intToRoman(int num) {
        String ans = "";
        String[] romanSymbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int i = 0; i < 13; i++) {
            while (num >= values[i]) {
                ans += romanSymbol[i]; // Append the Roman numeral
                num -= values[i]; // Subtract the corresponding value from num
            }
        }
        return ans;
    }
}





// Input: num = 3749

// Output: "MMMDCCXLIX"
