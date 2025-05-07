class Solution {
    public boolean isAlienSorted(String[] W, String O) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < O.length(); i++) {
            map.put(O.charAt(i), i);
        }

        for (int i = 1; i < W.length; i++) {
            String a = W[i - 1];
            String b = W[i];
            int len = Math.min(a.length(), b.length());
            boolean isSorted = false;

            for (int j = 0; j < len; j++) {
                char charA = a.charAt(j);
                char charB = b.charAt(j);

                if (map.get(charA) < map.get(charB)) {
                    isSorted = true;
                    break;
                } else if (map.get(charA) > map.get(charB)) {
                    return false;
                }
            }

            if (!isSorted && a.length() > b.length()) {
                return false;
            }
        }

        return true;
    }
}
