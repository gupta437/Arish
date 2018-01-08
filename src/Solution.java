package project;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void insertIntoSorted(int[] ar) {
        int n = ar.length;
        int insert = ar[n-1];
        
        for(int x=n-1;x>=0;x--){ 
          if(x==0 && insert<=ar[0]){
                  ar[x]=insert;
                  System.out.println(ar);
              }else if(insert<=ar[x-1]){              
            
              ar[x] = ar[x-1];  
              System.out.println(ar);
          
            }else if(insert>ar[x-1] && insert<ar[x+1]){
                ar[x]= insert;                 
                System.out.println(ar);
            }
           }
         }
}
