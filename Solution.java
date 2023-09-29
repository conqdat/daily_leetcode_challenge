
class Solution {

    public static String reverseWords(String s) {
        s = s.trim();
        String[] sChar =  s.split(" ");
        int resultIndex = 0;
        String[] result = new String[sChar.length];

        for(int i = result.length - 1; i >= 0; i--) {
            result[resultIndex] = sChar[i];
            resultIndex++;
        }
        
        return String.join(" ", result).replaceAll("\\s+"," ");
    }

    public static void main(String[] args) {
        String s = "a good   example";
        
        System.out.println( reverseWords(s) );

    }
}