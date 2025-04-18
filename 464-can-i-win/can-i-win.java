class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if(desiredTotal==0){
            return true;
        }
        if((maxChoosableInteger *(maxChoosableInteger+1))/2<desiredTotal){
            return false;
        }
        Map<Integer,Boolean>memo=new HashMap<>();
        return canWin(maxChoosableInteger,desiredTotal,0,memo);
    }
    private boolean canWin(int maxChoosableInteger, int desiredTotal, int used, Map<Integer, Boolean> memo) {
    if (memo.containsKey(used)) {
        return memo.get(used);
    }

    for (int i = 1; i <= maxChoosableInteger; i++) {
        int currBit = 1 << i;
        if ((used & currBit) == 0) {
            if (desiredTotal - i <= 0 || 
                !canWin(maxChoosableInteger, desiredTotal - i, used | currBit, memo)) {
                memo.put(used, true); // mark this state as winning
                return true;          // immediately return
            }
        }
    }

    memo.put(used, false); // no winning move found
    return false;
}

}