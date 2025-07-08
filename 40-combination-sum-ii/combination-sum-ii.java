class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Important for duplicate handling
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    public static void backtrack(int[] candidates, int target, int start, List<Integer> path, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates at the same recursive level
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            if (candidates[i] > target) break;

            path.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, path, result); // i+1 because no reuse
            path.remove(path.size() - 1);
        }
    }
}