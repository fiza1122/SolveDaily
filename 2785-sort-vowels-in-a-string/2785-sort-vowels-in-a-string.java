class Solution {
    public String sortVowels(String s) {
         ArrayList<Character> ch = new ArrayList<Character>();
         String t="";
        
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)=='A')||(s.charAt(i)=='E')||(s.charAt(i)=='I')||(s.charAt(i)=='O')||(s.charAt(i)=='U')||                       (s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u')){
                //ch(i)=s.charAt(i);
                ch.add(s.charAt(i));
            }}
        
        Collections.sort(ch);
        int c=0;
        
           for(int i=0;i<s.length();i++){
            if((s.charAt(i)=='A')||(s.charAt(i)=='E')||(s.charAt(i)=='I')||(s.charAt(i)=='O')||(s.charAt(i)=='U')||                       (s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u')){
               
                t=t+ch.get(c++);
            }
           else {
               t=t+s.charAt(i);
           }}
        
        return t;
            }
        }
    
// char ar[] = s.toCharArray(); 
         // Arrays.sort(ar);