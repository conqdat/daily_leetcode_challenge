import java.util.*;

class Solution {

    public static int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        int j = 0;  // Index for the result array

        for (int i = 0; i < n; i++) {
            int asteroid = asteroids[i];
            
            // Check for collisions and update the result array
            while (j > 0 && asteroids[j - 1] > 0 && asteroid < 0 && asteroids[j - 1] < Math.abs(asteroid)) {
                j--;
            }
            // Handle different cases based on collision conditions
            if (j == 0 || asteroid > 0 || asteroids[j - 1] < 0) {
                asteroids[j++] = asteroid;
            } else if (asteroids[j - 1] == Math.abs(asteroid)) {
                j--;
            }
        }
        // Create the final result array with valid elements
        int[] result = new int[j];
        System.arraycopy(asteroids, 0, result, 0, j);

        return result;
    }

    public static void main(String[] args) {
        int[] asteroids = { 10,2,-5 };
        // int[] asteroids = { 5,10,-5 };

        System.out.println( asteroidCollision(asteroids) );
    }
}
