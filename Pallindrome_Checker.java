import java.util.*;
public class Pallindrome_Checker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int a=sc.nextInt();
        int org_num=a;
        int rev=0;
        while(a!=0){
            rev=rev*10 + a%10;  // 0*10+1234%10=4, 4*10+123%10=40+3=43, 43*10+12%10=430+2=432, 432*10+1%10=4320+1=4321
            a=a/10;
        }
        if(org_num==rev){
            System.out.println("It is a Pallindrome");

        }
        else{
            System.out.println("It is not a Pallindrome");
        }
    }
    
}
