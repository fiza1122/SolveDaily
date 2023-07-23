class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length(); //6 Ananya
        int l2=word2.length(); //4 Fiza
        String c=""; //ya
        String t="";
        if(l1>l2){
            c=word1.substring(l1-(l1-l2),l1);
            word1=word1.substring(0,l1-(l1-l2));
        }
        else{
            c=word2.substring(l2-(l2-l1),l2);
             word2=word2.substring(0,l2-(l2-l1));
        }
        for(int i=0;i<word1.length();i++){
            t=t+word1.charAt(i)+word2.charAt(i);
        }
        t=t+c;
        return t;
    }
}