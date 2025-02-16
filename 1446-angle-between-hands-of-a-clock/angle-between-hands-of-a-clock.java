class Solution {
    public double angleClock(int hour, int minutes) {
        float h=hour;
        float m=minutes;
        double small=(h*5)%60+(m/60)*5;
        double big=m;
        double ans=Math.abs(small-big)*6;
        return Math.min(ans,360-ans);
    }
}