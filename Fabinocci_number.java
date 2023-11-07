import java.util.Scanner;

public class Fabinocci_number {

    // function defination

    public static int fibonocciFinding(int n)
    {
        int result = 0;
        //1. base case condition 
        if(n <= 1)
        {
            return n;
        }
        // 2. recursive function call
        else
        {
            result = fibonocciFinding(n-1) + fibonocciFinding(n-2);
        }
        return result;
    }
    
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in fibonacci series: ");
        int n= sc.nextInt();

        int result = fibonocciFinding(n);
        System.out.println("Final Output is: "+result);
    }
}
