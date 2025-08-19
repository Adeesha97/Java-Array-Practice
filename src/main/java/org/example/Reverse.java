package org.example;

public class Reverse {
    public static void main(String[] args){
        String textInput= "ABCD";
        StringBuilder textOutput1 = new StringBuilder();

        int textInputLength = textInput.length();

        for (int i = textInputLength-1; i >=0 ; i--){
            textOutput1.append(textInput.charAt(i));
        }

        System.out.println("Reverse Array Method 1 - " + textOutput1);

        StringBuilder textOutput2 = new StringBuilder(textInput);
        System.out.println("Reverse Array Method 2 - " + textOutput2.reverse());
    }
}
