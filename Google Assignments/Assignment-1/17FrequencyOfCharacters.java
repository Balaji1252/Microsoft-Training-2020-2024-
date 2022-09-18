import java.util.*;
class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int l=str.length();
        int[]f=new int[26];
        for(int i=0;i<l;i++){
            f[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(f[i]>0){
                System.out.println((char)(i+97)+" "+f[i]);
            }
        }
    }
}