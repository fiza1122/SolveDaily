class Solution {
    public String sortVowels(String s) {
         ArrayList<Character> ch = new ArrayList<Character>();
         String t="";
        
        for(int i=0;i<s.length();i++){
            if((check(s.charAt(i)))){  
                ch.add(s.charAt(i));
            }}
        
        Collections.sort(ch);
        int c=0;
        
           for(int i=0;i<s.length();i++){
            if((check(s.charAt(i)))){  
                t=t+ch.get(c++);}
           else {
               t=t+s.charAt(i);
           }}
          return t;
            }
    public boolean check(char c){
     if((c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')||(c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')){
        return true;
    }
        return false;
    }
        }
    
// char ar[] = s.toCharArray(); 
         // Arrays.sort(ar);