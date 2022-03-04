import java.util.*;
public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        
        int a=sc.nextInt();
        System.out.println(a);

        //1. Using algorithm
        /*
        int rev=0;
        while(a!=0){
            rev=rev*10 + a%10;  // 0*10+1234%10=4, 4*10+123%10=40+3=43, 43*10+12%10=430+2=432, 432*10+1%10=4320+1=4321
            a=a/10;
        }
        */

        //2. Using StrigBuffer class
        /*
        StringBuffer sb=new StringBuffer(String.valueOf(a));
        StringBuffer rev=sb.reverse();
        */
        //3. StringBuilder method
        StringBuilder sb1=new  StringBuilder();
        sb1.append(a);
        StringBuilder rev=sb1.reverse();
        System.out.println("Now rev is "+rev);
        

        
         
    }    
}
