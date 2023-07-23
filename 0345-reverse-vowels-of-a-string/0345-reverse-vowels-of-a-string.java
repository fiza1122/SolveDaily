class Solution {
     public String reverseVowels(String s) {
       char ch[]=s.toCharArray();int c=0;
         for(int i=0;i<ch.length;i++){
              if(check(ch[i])){
             // if((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')||                                                     (ch[i]=='A')||(ch[i]=='E')||(ch[i]=='I')||(ch[i]=='O')||(ch[i]=='U')){
                 c++;
             }
         }
         char cc[]= new char[c];
         int j=0;
          for(int i=0;i<ch.length;i++){
               if(check(ch[i])){
             // if((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')||                                                     (ch[i]=='A')||(ch[i]=='E')||(ch[i]=='I')||(ch[i]=='O')||(ch[i]=='U')){
                 cc[j]=ch[i];
                 j++;
             }
         }
         
           for(int i=0;i<ch.length;i++){
               if(check(ch[i])){
             // if((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')||                                                     (ch[i]=='A')||(ch[i]=='E')||(ch[i]=='I')||(ch[i]=='O')||(ch[i]=='U')){
                 ch[i]=cc[c-1];
                 c--;
             }
         }
        return String.valueOf(ch);
        }
     public boolean check(char c){
         if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')){
             return true;
     }
         return false;
}
}
//     public String reverseVowels(String s) {
//         char ch[]=s.toCharArray(); //{L,E,E,T,C,O,D,E}
//          char c2[]=ch;             //{0,1,2,3,4,5,6,7}
//         char c;
//        for(int i=0;i<ch.length;i++) //0 TO 7
//        {  
//            if((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')||                        (ch[i]=='A')||(ch[i]=='E')||(ch[i]=='I')||(ch[i]=='O')||(ch[i]=='U'))
//              {    
//                    c=ch[i]; // FIRST ITERATION L doest pass, next e passes.  ext e at 2 passess
//                  ch[i]=check(c,i,ch);  //check(e,1,{L,E,,T,C,O,D,E}) 
//                }                          //          {0,1,2,3,4,5,6,7}
//        }
//         return String.valueOf(ch);
//         }
    
// //     public char check(char c,int i,char ch[]){ //{ e,1,{L,E,E,T,C,O,D,E},{L,E,E,T,C,O,D,E}}
        
// //         for(int j=i+1;j<ch.length-1;j++)
// //        {  
// //             if((ch[j]=='a')||(ch[j]=='e')||(ch[j]=='i')||(ch[j]=='o')||(ch[j]=='u')||                                                    (ch[j]=='A')||(ch[j]=='E')||(ch[j]=='I')||(ch[j]=='O')||(ch[j]=='U'))
// //              {    
// //                     char  p=ch[j]; //p==ep==o
// //                     ch[j]=c;// {L,E,e,T,C,e,D,E}
// //                 c=p;
                    
// //                }}
// //                 return 
// //         }
    
// }