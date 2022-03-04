public class Swap_numbers {
    public static void main(String[] args) {
        int a=10, b=9;
        System.out.println("Values before swapping are.."+a+" "+b);
        // Logic 1- Third varible
        // int t=a;
        // a=b;
        // b=t;
        // Logic 2 - use + & - without using third variable
        // a=a+b;  //10+9=19
        // b=a-b;  //19-9=10 Here a=19
        // a=a-b;  //19-10=9

        // Logic 3 - use * and / without using third variable
        // here a and b values should not be Zero

        /*a=a*b; //10*9=90
        b=a/b; //90/9=10
        a=a/b; //90/10=9*/

        // Logic-4 use bitwise XOR (^)
        a=a^b;
        System.out.println(a);
        b=a^b;
        System.out.println(b);
        a=a^b;
        System.out.println(a);
        System.out.println("Values after swapping are.. a="+a+" b="+b);

        
    }
    
}
