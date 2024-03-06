
/*
Problem:

 given string and xvowels: abeiout
 if there are consecutive two xvowels then make the first vowel capital and remove the second

 Eaxmple:
  inpute:"maayrut"
  output: "mAyU
  Explanation: aa are  consecutive xvowel so remove one a and capitalize first a
                ut are  consecutive xvowel so remove t and capitalize U
                Ans = mAyU
 */


import java.io.*;
import java.util.Scanner;

public class String2 {

    public static boolean isXVowel(char ch){
        //abeiout
        if(ch=='a' || ch=='b' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='t') return true;
        return false;
    }
    public static String process(String str) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<str.length()-1;i++){
            if(isXVowel(str.charAt(i)) && isXVowel(str.charAt(i+1))){
                char cap = (char)((int)str.charAt(i)-32);
                result.append(cap);
                i++;
            }
            else{
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main (String[] args) {
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            String line = in.nextLine().trim();
            String retVal = process(line);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            output.println(retVal);
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
