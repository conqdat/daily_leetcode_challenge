class Solution {

    public static char[] swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }

    public static String revertStringWithoutNumber(String str) {
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        while (left <= right) {
            if (!Character.isDigit(ch[left])) {
                while (right >= 0 && Character.isDigit(ch[right])) {
                    right--;
                }
                if (right >= 0) {
                    ch = swap(ch, left, right);
                    left++;
                    right--;
                }
            } else {
                left++;
            }
        }

        return new String(ch);
    }

    public static void main(String[] args) {
        String str = "H3ll0 W0r1d";
        // Output: "dlr3W 0ll0H"

        // Time complexity: O(n)
        // Space complexity: O(1)
        System.out.println(revertStringWithoutNumber(str));
    }
}
