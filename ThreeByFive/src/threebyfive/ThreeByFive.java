package threebyfive;
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

public class ThreeByFive {

    public static void main(String[] args) {
        //print 1 - 100
        //if # is divisible by 3 print fizz
        //if # is divisible by 5 print buzz
        //if # is divisible by 3 and 5 print fizz buzz
        int i;
        for (i = 1;i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Fizz Buzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
    
}
