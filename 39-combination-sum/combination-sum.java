import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combo = new ArrayList<>(); // Initialize combo
        backtrack(candidates, target, combo, result, 0);
        return result;
    }

    public void backtrack(int[] candidates, int target, List<Integer> combo, List<List<Integer>> result, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(combo)); // Add a copy of combo
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) { // Use candidates.length
            combo.add(candidates[i]);
            backtrack(candidates, target - candidates[i], combo, result, i);
            combo.remove(combo.size() - 1); // Backtrack step
        }
    }
}
