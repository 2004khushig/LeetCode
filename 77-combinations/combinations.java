class Solution {
    public List<List<Integer>> combine(int n, int k) {
         List<List<Integer>>res=new ArrayList<>();
        List<Integer>combo=new ArrayList<>();
        backtrack(1,res,combo,n,k);
        return res;
    }
    public static void backtrack(int start,List<List<Integer>>res,List<Integer>combo,int n,int k){
        if(combo.size()==k){
            res.add(new ArrayList<>(combo));
            return;
        }
        for(int i=start;i<=n;i++){
            combo.add(i);
            backtrack(i+1,res,combo,n,k);
            combo.remove(combo.size()-1);
        }
    }
}