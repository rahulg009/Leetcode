class Solution {
    
        final Map<Integer, Integer> memo = new HashMap<>();

    public int numDecodings(String s) {
        return numDecodings(s, 0);
    }

    public int numDecodings(String s, int current) {

        if (!memo.containsKey(current)) {
            if (current == s.length()) {
                memo.put(current, 1);
                return 1;
            }
            if (current > s.length() || s.charAt(current) == '0') {
                memo.put(current, 0);
                return 0;
            }
            int decoding = 0;
            if (s.charAt(current) == '1') {
                
                decoding += numDecodings(s, current + 2);
            }
            if (s.charAt(current) == '2' && s.length() > current + 1 && s.charAt(current + 1) <= '6') {
                decoding += numDecodings(s, current + 2);
            }
            decoding += numDecodings(s, current + 1);
            memo.put(current, decoding);
        }
        return memo.get(current);
    }
        
    }