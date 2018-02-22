/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author irakli
 */
public class Loto
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        URL url  = new URL("http://www.mbnet.com.pl/dl.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String str = "";
        
        while ((str=in.readLine())!=null)
      {
        System.out.println(str);
      }
  
        
       
        
        in.close();
        System.out.println("KONIEC");
    }
    
}
