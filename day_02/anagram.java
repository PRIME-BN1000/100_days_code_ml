package day_02;

import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w, a;
        int c=0;
        System.out.println("Enter a word : ");
        w=sc.next();
        System.out.println("Enter a word to check whether it is an anagram or not : ");
        a=sc.next();
        if(w.length()!=a.length())
            System.exit(0);
        char arr[]=a.toCharArray();
        for(int i=0; i<w.length(); i++){
            for(int j=0; j<a.length(); j++){
                if(w.charAt(i)==arr[j]){
                   arr[j]='\0';
                    c++;
                    break;
                }
            }
        }
        if(c==w.length())
            System.out.println("The words are anagrams.");
        else
            System.out.println("These words are not anagrams.");
        sc.close();
    }
}
