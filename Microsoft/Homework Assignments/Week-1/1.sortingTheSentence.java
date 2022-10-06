class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String str1="";
        String[] str2=new String[str.length];
        for(int i=0;i<str.length;i++){
            int temp=(str[i].charAt(str[i].length()-1))-'0';
            str2[temp-1]=str[i];
        }
        for(int i=0;i<str.length;i++){
            str1+=str2[i].substring(0,str2[i].length()-1);
            if(i!=str.length-1){
                str1+=" ";
            }
        }
        return str1;
    }
}
