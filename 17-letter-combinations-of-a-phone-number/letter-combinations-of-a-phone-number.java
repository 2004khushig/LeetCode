class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }

        String[] mapping = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };

        solve(digits, "", 0, ans, mapping);
        return ans;
    }
    private void solve(String digits, String output, int i, List<String> ans, String[] mapping){
        if(i==digits.length()){
            ans.add(output);
            return;
        }
        int num=digits.charAt(i)-'0';
        String value=mapping[num];
        for(int j=0;j<value.length();j++){
            solve(digits,output+value.charAt(j),i+1,ans,mapping);
        }
    }
}