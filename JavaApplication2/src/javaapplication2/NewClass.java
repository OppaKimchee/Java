import  java.awt.*;
import  javax.swing.*;
import  java.awt.event.*;
import  javax.swing.event.*;
import  java.io.*;
import  java.util.*;
import  java.text.*;

public class  DemoRandom
{
    public static void main(String [] args)
    {
        int n1,n2,n3,n4,n5,n6,dice;
        n1=n2=n3=n4=n5=n6=dice=0;
        String out = "";
        
        for (int i = 0; i < 1000; i++)
        {
            dice = (int)(Math.random()*6)+1;
            switch (dice)
            {
                case 1 : n1++;break;
                case 2 : n2++;break;
                case 3 : n3++;break;
                case 4 : n4++;break;
                case 5 : n5++;break;
                case 6 : n6++;break;
                default : ;
            }
        }
        out = "Dice has been thrown 1000 times\n";
        out += "occurences of 1's are"+n1+"\n";
        out += "occurences of 2's are"+n2+"\n";
        out += "occurences of 3's are"+n3+"\n";
        out += "occurences of 4's are"+n4+"\n";
        out += "occurences of 5's are"+n5+"\n";
        out += "occurences of 6's are"+n6+"\n";
        JOptionPane.showMessageDialog(null, out);
    }
}