class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set seen=new HashSet();
        Set repeat=new HashSet();
        for(int i=0;i+9<s.length();i++){
            String word=s.substring(i,i+10);
            if(!seen.add(word)){
                repeat.add(word);
            }
        }
        return new ArrayList(repeat);
    }
}