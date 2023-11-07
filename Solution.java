import java.util.*;

class Solution {


    public static void main(String[] args) {

        System.out.println( 8 >> 2 ); // 8 / 2^2 
        System.out.println( 8 << 2 ); // 8 * 2*2

        System.out.println("==========================");

        
        System.out.println( 2 | (1 << 2) ); // set bit 2-th to 1 |||| 010 => 110
        System.out.println(2 ^ (1 << 3)); // flip bit 3-th  ||||   0010 => 1010
        System.out.println(2 & ~(1 << 1)); // clear bit 1-th ||| 010 => 000  
    }
}



