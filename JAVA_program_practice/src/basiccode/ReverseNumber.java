//Reverse the number 
package basiccode;
import java.util.Scanner;

class ReverseNumber{
    public static void reverseNumber(int num)
    {
        int mod=0,reverse=0;
        
            while(num != 0)   
            {  
             mod = num % 10;  
            reverse = reverse * 10 + mod;  
            num = num/10;  
            } 
            System.err.println("Reverse of "+num+" is : "+reverse); 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
        reverseNumber(num);
        return;
    }
}