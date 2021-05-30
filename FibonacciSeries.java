import java.util.*;
public class FibonacciSeries  {
    double number = 0.0;
    public static void main(String[] args) {
        FibonacciSeries F1 = new FibonacciSeries();
        F1.input();
        F1.print();
    }
    public void input()
    {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter the number upto which You want to print the FibonacciSeries : ");
        number = sc.nextDouble();
    }
    public void print(){
        int  a = 0;
        int b = 1;
        int sum = 1;
        System.out.print(a+",");
        while(number > sum)
        {
                
                System.out.print(sum+",");
                sum = a+b;
                a = b;
                b = sum;  
        }
        System.out.println();
    }
}
