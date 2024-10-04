package org.example;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(convertDecimalToBinary(13));



    }


    public static boolean checkForPalindrome( String metin){

        String cleanedMetin = metin.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        LinkedList<Character> charList= new LinkedList<>();
        for(char c: cleanedMetin.toCharArray()){
           charList.add(c);
        }
        while (charList.size()>1){
            if(!charList.pollFirst().equals(charList.pollLast())){
                return false;
            }
        }
        return true;
    }
    public static String convertDecimalToBinary(int decimal){
        LinkedList<Integer> binaryList=new LinkedList<>();
        while(decimal>0){
            int remainder = decimal%2;
            binaryList.addFirst(remainder);
            decimal=decimal/2;
        }
        StringBuilder binaryDigits=new StringBuilder();
        for(int digit: binaryList ){
            binaryDigits.append(digit);
        }
        return binaryDigits.toString();
    }
}