/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removecharrepeated;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Removecharrepeated {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;
        // TODO code application logic here
        Scanner ss=new Scanner(System.in);
        s=ss.nextLine();
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
            if(c[i]==c[j])
            {
               c[j]=0; 
            }
        }
    }
        for(int i=0;i<s.length();i++)
        { if(c[i]!=0)
        {
            System.out.print(""+c[i]);
            }
        }
        
    
}
}
