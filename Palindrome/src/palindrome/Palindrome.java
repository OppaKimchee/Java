package palindrome;
import  java.awt.*;
import  javax.swing.*;
import  java.awt.event.*;
import  javax.swing.event.*;
import  java.io.*;
import  java.util.*;
import  java.text.*;

///////////////////////////////
//Kim,Justin                 //
//written in NetBeans IDE 8.1//
///////////////////////////////

public class Palindrome {

    public static void main(String[] args) {
        
        System.out.print("Type a Palindrome: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String wordBack = "";
        
        word= word.replaceAll("[\\W]","");
        System.out.println(word);
        for ( int i = word.length()-1; i >= 0; i-- ){
            wordBack += word.charAt(i);
        }
        
        System.out.println(word);
        System.out.println(wordBack);
        
        if((wordBack).equals(word)){
            System.out.println("yay");
        }
        else{
            System.out.println("nay");
        }

    }
    
}
