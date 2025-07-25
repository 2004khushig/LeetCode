class Solution {
    public int findMaximizedCapital(int k, int w, int[] p, int[] c) {
        PriorityQueue<int[]>minpq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        PriorityQueue<Integer>maxpq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<p.length;i++){
            minpq.add(new int[]{c[i],p[i]});
        }
        int cc=w;
        for(int i=0;i<k;i++){
            while(!minpq.isEmpty() && minpq.peek()[0]<=cc){
                maxpq.add(minpq.poll()[1]);
            }
            if(maxpq.isEmpty()) break;
            cc+=maxpq.poll();
        }
        return cc;
    }
}