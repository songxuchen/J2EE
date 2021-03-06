package dp;

public class WordChange {
    public int minDistance(String word1, String word2) {
        if(word1 == null || word2 == null) {
            return Integer.MIN_VALUE;
        }
        if(word1.length() == 0) {
            return word2.length();
        }
        if(word2.length() == 0) {
            return word1.length();
        }
        
        return recur(word1, word2, 0, 0);
    }
    private int recur(String word1, String word2, int index1, int index2) {
        if(index1 == word1.length()) {
            return word2.length() - index2;
        }
        if(index2 == word2.length()) {
            return word1.length() - index1;
        }
        
        if(word1.charAt(index1) == word2.charAt(index2)) {
            return recur(word1, word2, index1 + 1, index2 + 1);
        } else {
            //第一个是：增 ，然后删，然后是改 
            return Math.min(Math.min(recur(word1, word2, index1 + 1, index2), recur(word1, word2, index1,
            index2 + 1)), recur(word1, word2, index1 + 1, index2 + 1)) + 1;
        }
        
    }
}