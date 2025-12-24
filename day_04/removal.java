package day_04;

import java.util.*;

public class removal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        System.err.println("Enter a letter to remove:");
        char letterToRemove = scanner.nextLine().charAt(0);
        int l=sentence.length();
        for(int i=0;i<l;i++){
            if(sentence.charAt(i)==letterToRemove){
                sentence=sentence.substring(0,i)+sentence.substring(i+1);
                i--;
                l--;
            }
        }
        System.out.println("Filtered sentence: " + sentence);
        scanner.close();
    }
}