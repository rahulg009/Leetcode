
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> unique = new HashSet();
        for(int i:candyType){
            unique.add(i);
        }
        return Math.min(unique.size(),candyType.length/2);
    }
}