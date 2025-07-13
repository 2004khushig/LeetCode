class Solution {
    public String getPermutation(int n, int k) {
        List<Integer>res=new ArrayList<>();
        int fact=1;
        for(int i=1;i<=n;i++){
            res.add(i);
            fact*=i;
        }
        k--;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            fact=fact/(n-i);
            int index=k/fact;
            sb.append(res.get(index));
            res.remove(index);
            k=k%fact;
        }
        return sb.toString();
    }
}