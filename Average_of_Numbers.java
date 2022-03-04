import java.util.*;
// static void Average(){
//     int Average=(a+b+c)/3;
//     System.out.print("The averrage of the three numbers is " + Average);

// }
public class Average_of_Numbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The three numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        float Average=(a+b+c)/3;
        System.out.print("The averrage of the three numbers is " + Average);
    }
}
