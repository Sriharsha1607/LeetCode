class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        q.offer(t);
        int val = t - 3000;
        while(q.peek() < val){
            q.poll();
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */