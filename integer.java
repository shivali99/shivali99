import java.io.*;
import java.util.*;
 
class A
{
     
     static void numbers With >3 Divisors(int n)
    {
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
  
        for (int p = 2; p*p <= n; p++)
        {
             
            
            if (prime[p] == true)
            {
               
                for (int i=p*2; i<=n; i += p)
                    prime[i] = false;
            }
        }
  
       
        System.out.println("Numbers with >3 divisors : ");
        for (int i=0;  i*i <= n ; i++)
            if (prime[i])
                System.out.print(i*i + " ");
    }
      public static void main (String[] args)
    {
        int n = 10;
        numbersWith >3 Divisors(n);
    }
}
 /*OUTPUT/*
 output:3,2
