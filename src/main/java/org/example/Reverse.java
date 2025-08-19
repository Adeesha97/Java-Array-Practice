package org.example;

public class Reverse {
    public static void main(String[] args){
        String textInput= "ABCD";
        String textOutput= "";

        int textInputLength = textInput.length();

        for (int i = textInputLength-1; i >=0 ; i--){
            textOutput = textOutput + textInput.charAt(i);
        }
        System.out.println("Reverse Array - " + textOutput);
    }
}
