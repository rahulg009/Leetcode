class Solution {
    public int maximumProduct(int[] nums, int k) {
        long result = 1;
        long mod = 1000000007;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i : nums)
            queue.add(i);
        while(k>0)
        {
            int pop = queue.poll();
            pop++;
            queue.add(pop);
            k--;
        }
        while(!queue.isEmpty())
            result=(result*queue.poll())%mod;
        return (int)result;
    }
}