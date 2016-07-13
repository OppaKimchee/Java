import  java.awt.*;
import  javax.swing.*;
import  java.awt.event.*;
import  javax.swing.event.*;
import  java.io.*;
import  java.util.*;
import  java.text.*;

public class  DemoRandomString
{
	
	public static void main(String [] args)
        {
//            Random r = new Random();
//            
//            for(int i = 0; i < 20; i++)
//            {
//                System.out.println("===>"+r.nextInt(40));  
//            }
            
            String x = "Hello From Jupiter";
            String out = x.toUpperCase()+"\n";
            out += x.toLowerCase()+"\n";
            int a = 'A';
            String r = "";
            
            for(int i = 0; i < x.length(); i++)
            {
                char ch = x.charAt(i);
                if(isUpper(ch))//if(Character isUpperCase(ch))
                {
                    char xx = (char)(ch + 32);
                    r += xx;
                }
                else if(isLower(ch))//if(Character isLowerCase(ch))
                {
                    char xx = (char)(ch - 32);
                    r += xx;
                }
                else
                    r+=ch;
            }
            out+=r;
            System.out.println(out);
        }
        public static boolean isUpper(char x)
        {
//            if(x >= 'A' && x <= 'Z')
//            {
//                return true;
//            }
//            return false;
          return  x >= 'A' && x <= 'Z';
        }
        
        public static boolean isLower(char x)
        {
            return x >= 'a' && x <= 'z';
        }
}

