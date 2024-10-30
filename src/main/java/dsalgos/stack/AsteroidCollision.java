package dsalgos.stack;

import java.util.Stack;

public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {

        /** [ -2, -2, 1, -2]
         for i = 1 to n-1
         if opp sign and i is -ve
         compare
         while(opp sign and top < i) stack.pop
         if(same sign) stack.push i
         else do nothing
         */

        Stack<Integer> store = new Stack<>();
        for(int asteroid : asteroids) {
            if(store.isEmpty()) {
                store.push(asteroid);
                continue;
            }

            int top = store.peek();
            if(sign(top) != sign(asteroid) && sign(asteroid) < 0) {
                while(!store.isEmpty()
                        && sign(top = store.peek()) != sign(asteroid)
                        && Math.abs(top) < Math.abs(asteroid)) {
                    store.pop();
                }

                if(!store.isEmpty()) {
                    if(sign(top) == sign(asteroid)) {
                        store.push(asteroid);
                    } else if(Math.abs(top) == Math.abs(asteroid)) {
                        store.pop();
                    }
                } else {
                    store.push(asteroid);
                }
            } else {
                store.push(asteroid);
            }
        }
        int result[]=new int[store.size()];
        for(int i=result.length-1;i>=0;i--){
            result[i]=store.pop();
        }
        return result;
    }

    int sign(int num) {
        return num < 0 ? -1 : 1;
    }
}
