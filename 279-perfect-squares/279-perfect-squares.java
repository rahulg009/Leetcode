class Solution {
   public int numSquares(int n) {
        int[] sq = new int[n+1];
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (square > n) break;
            sq[i] = square;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        int count = 1;
        queue.offer(n);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int j = 0; j < len; j++) {
                Integer num = queue.poll();
                int k = (int) Math.sqrt(num);
                for (int i = k; i >= 1; i--) {
                    int res = num - sq[i];
                    if (res == 0) {
                        return count;
                    } else {
                        queue.offer(res);
                    }
                }
            }
            count++;
        }
        return count;
    }
}