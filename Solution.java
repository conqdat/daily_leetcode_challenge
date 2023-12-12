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

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int aPoint = 0;
        int bPoint = 0;

        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                aPoint++;
            }
            if(a.get(i) < b.get(i)) {
                bPoint++;
            }
        }

        result.add(aPoint);
        result.add(bPoint);

        return result;
    }

    public static void main(String[] args) {
        
        List<Integer> a = Arrays.asList(5,6,7);
        List<Integer> b = Arrays.asList(3,6,10);


        System.out.println(
            compareTriplets(a, b)
        );
    }
}
