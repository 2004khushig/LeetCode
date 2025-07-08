class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,target,0,new ArrayList<>(),ans);
        return ans;
    }
    public static void backtrack(int[]candidates,int target,int index,List<Integer>path,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(candidates[i]>target) continue;
            path.add(candidates[i]);
            backtrack(candidates,target-candidates[i],i,path,ans);
            path.remove(path.size()-1);
        }
    }
}
