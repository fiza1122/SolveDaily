class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] str= s.split(" ");
        String p=" ";
        int j=0;
        for(int i=str.length-1;i>=0;i--){
             p=p+" "+str[i];
             p=p.trim();
        }
       
        return p;
    
}
}