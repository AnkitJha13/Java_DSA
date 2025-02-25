class Solution{
    ArrayList<Integer> countChars (String s)
    {
        // code here
        int sum = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                sum++;
            }
            else{
                res.add(sum);
                sum = 0;
            }
        }
        res.add(sum);  // for last as there wont be any space left for it so handled separately
        return res;
    }
}


// Input:
S = "the quick brown fox"
Output: 3 5 5 3
Explanation: "the" has 3 characters
"quick" has 5 characters
"brown" has 5 characters
"fox" has 3 characters
