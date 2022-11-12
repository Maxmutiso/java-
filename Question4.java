package question.pkg4;

import java.util.Scanner;


public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 150;  
System.out.print("the multiples of 2,3 and 7 are: "+number+": ");  
for (int i=71; i<=number; i++)   
{  
if ((i%2==0)&(i%3==0)&(i%7==0) )   
{  
System.out.print(i + " ");  
}  
}  
} 
     
    }