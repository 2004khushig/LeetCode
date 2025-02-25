class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count=0;
        int index=0;
        for(int day=1;day<=100000;day++){
            while(!pq.isEmpty()&& pq.peek()<day){
                pq.poll();
            }
            while(index<events.length&&events[index][0]==day){
                pq.add(events[index][1]);
                index++;
            }
            if(!pq.isEmpty()){
                pq.poll();
                count++;
            }
        }
        return count;
    }
}