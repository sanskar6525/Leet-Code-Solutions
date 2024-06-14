class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int[] stack = new int[asteroids.length];
        int top = -1; 
        for (int g : asteroids) {
            if (top == -1) {
                stack[++top] = g;
            } else {
                if (g < 0) {
                    if (stack[top] < 0) {
                        stack[++top] = g;
                    } else {
                        while (top >= 0 && stack[top] > 0 && stack[top] < (-g)) {
                            top--;
                        }
                        if (top >= 0) {
                            if (stack[top] > 0 && stack[top] == (-g)) {
                                top--;
                            } else if (stack[top] < 0) {
                                stack[++top] = g;
                            }
                        } else {
                            stack[++top] = g;
                        }
                    }
                } else {
                    stack[++top] = g;
                }
            }
        }
        int[] ans = new int[top + 1];
        for (int i = 0; i <= top; i++) {
            ans[i] = stack[i];
        }
        return ans;
    }
}
