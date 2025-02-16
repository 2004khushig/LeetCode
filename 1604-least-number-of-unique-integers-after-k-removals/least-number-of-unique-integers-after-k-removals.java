class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int a:arr){
            mp.put(a,mp.getOrDefault(a,0)+1);
        }
        List<Integer>list=new ArrayList<>();
        int count=0;
        for(int a:mp.values()){
            list.add(a);
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            if(k>list.get(i)){
            k-=list.get(i);
            list.set(i,0);
            }
        
        else{
            list.set(i,list.get(i)-k);
            k=0;
            }
        if(list.get(i)!=0){
            count++;
           }
        }
        return count;
    }
}