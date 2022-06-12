class Solution {
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    public int numTrees(int n) {
        if(n == 0 || n == 1){
            return 1;
        }

        if(hashMap.containsKey(n)){
            return hashMap.get(n);
        }

        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += numTrees(i - 1) * numTrees(n - i);
        }
        hashMap.put(n, sum);
        return sum;
    }
}