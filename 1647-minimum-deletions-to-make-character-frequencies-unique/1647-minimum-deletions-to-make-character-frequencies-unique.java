class Solution {
    public int minDeletions(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        for(char letter: s.toCharArray()) {
            freqMap.put(letter, freqMap.getOrDefault(letter, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry: freqMap.entrySet()) {
            maxHeap.offer(entry.getValue());
        }
        while(!maxHeap.isEmpty()) {
            int frequent = maxHeap.poll();
            if(maxHeap.isEmpty()) {
                return answer;
            }
            if(frequent == maxHeap.peek()) {
                if(frequent > 1) {
                    maxHeap.offer(frequent - 1);
                }
                answer++;
            }
        }
        return answer;
    }
}