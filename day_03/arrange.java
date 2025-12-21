package day_03;

import java.util.*;;

public class arrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=0;
        System.out.println("Enter the string:");
        String str = sc.nextLine()+" ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                c++;
        }
        int l=str.length();
        System.out.println("The number of words in the string is: "+c);
        String ns=split(str,l);
        System.out.println("The arranged string is: "+ns);
    }

    public static String split(String s, int n){
        int p=0;
        String result="";
        for(int i=0; i<n; i++){
            if(s.charAt(i)==' '){
                String word=s.substring(p,i);
                p=i+1;
                char temp[]=sort(word);
                result=result+String.valueOf(temp)+" ";
            }
        }
        return result;
    }

    public static char[] sort(String str){
        int l=str.length();
        char charArray[]=str.toCharArray();
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if(charArray[i]>charArray[j]){
                    char temp=charArray[i];
                    charArray[i]=charArray[j];
                    charArray[j]=temp;
                }
            }
        }
        return charArray;
    }
}
