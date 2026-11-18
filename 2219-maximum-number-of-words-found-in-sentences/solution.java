class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords=0;
        for(String j : sentences)
        {
           int currentWords = j.length() - j.replace(" ", "").length() + 1;
            maxWords = Math.max(maxWords, currentWords);
        }
        return maxWords;
    }
}
