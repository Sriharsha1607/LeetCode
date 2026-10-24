class Solution {
    public static int days(String date){
        int[] monthEnds = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        int ans = day;
        for(int i=0;i<month-1;i++){
            ans += monthEnds[i];
        }
        return ans;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int first = Math.max(days(arriveAlice), days(arriveBob));
        int last = Math.min(days(leaveAlice), days(leaveBob));

        return Math.max(0, last-first+1);
    }
}