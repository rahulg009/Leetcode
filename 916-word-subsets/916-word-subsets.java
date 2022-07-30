class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int[] arr = new int[26];
        for(String word:words2){
            HashMap<Character,Integer> map = new HashMap<>();
            for(char ch:word.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            for(char ch:map.keySet()){
                arr[ch-'a'] = Math.max(arr[ch-'a'],map.get(ch));
            }
        }
        for(String word:words1){
            int[] count = new int[26];
            for(char ch:word.toCharArray()){
                count[ch-'a']++;
            }
            boolean flag = true;
            for(int i=0;i<26;i++){
                if(count[i]<arr[i]){
                    flag = false;
                }
            }
            if(flag) ans.add(word);
        }
        return ans;
    }
}