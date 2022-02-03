class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> astStack = new Stack<>();
        
        for (int i = 0; i < asteroids.length; ) {
            int curr = asteroids[i];
                    
            if (astStack.empty()) {
                astStack.push(curr);
                i++;
            } else {
                int last = astStack.peek();

                if (last > 0 && curr < 0) {
                    // Collision.
                    int currMag = Math.abs(curr);
                    
                    if (currMag <= last) i++; // Move on to next asteroid, current asteroid has exploded.
                    
                    if (currMag >= last) astStack.pop(); // Remove last, as it has exploded.
                    
                } else {
                    // No collision.
                    astStack.push(curr);
                    i++;
                }
            }
        }
        return stackToArray(astStack);
    }
    
    private int[] stackToArray(Stack<Integer> stack) {
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--)
            result[i] = stack.pop();
        return result;
    }
}