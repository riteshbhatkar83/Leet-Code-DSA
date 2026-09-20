class Solution {
    public int mostWordsFound(String[] sentences) {

        int max = 0 ;

    for (int i = 0   ; i < sentences.length; i++)
        {
           String currentSentence = sentences[i];

           int wordCount = 1;

           for(int j = 0 ; j < currentSentence.length();j++)
           {
            if(currentSentence.charAt(j) == ' '){
                wordCount++;
            }
           }

            if (wordCount > max) {
                max = wordCount;
        }
    }
     return max;
}
}