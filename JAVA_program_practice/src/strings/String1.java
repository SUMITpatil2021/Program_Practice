package strings;

import java.util.*;
import java.io.*;
///*
//Problem:
//
// given string and xvowels: abeiout
// if there are 2 or more than 2 consecutive two xvowels then remove the characters
//
// Eaxmple:
//  inpute:"maaayrt"
//  output: "mayrt
//  Explanation: aaa are  consecutive xvowel so remove all a
//                Ans = myrt
// */



public class String1 {
    public static boolean isXVowel(char ch){
        //abeiout
        if(ch=='a' || ch=='b' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='t') return true;
        return false;
    }
    public static String process(String str) {
        StringBuilder res = new StringBuilder();
        int i =0;

        while(i<str.length()){
            int j= i;
            int cnt = 0;
            while(j<str.length() && isXVowel(str.charAt(j))){
                j++;
                cnt++;
            }
            if(cnt<=1){
                res.append(str.charAt(i));
                i++;
            }
            else{
                i = j;
            }
        }

        return res.toString();
    }

    public static void main (String[] args) {
//        try {
//            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
//            String line = in.nextLine().trim();
//            String retVal = process(line);
//            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
//            output.println(retVal);
//            output.close();
//        } catch (IOException e) {
//            System.out.println("IO error in input.txt or output.txt");
//        }
    	
    	Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();
    	String res=process(str);
    	System.out.println(res);
    	


    }
}
