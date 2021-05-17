
import java.util.*;
public class MinutestoYear {
    int minutes = 0;
    int years, days = 0;
    public static void main(String[] Args)
    {
        
        
        System.out.println("Minutes to Year and days Convertor");
        MinutestoYear M1 = new MinutestoYear();
        M1.input();
        M1.MinutestoYears();
        M1.display();

    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minutes : ");
        minutes =  sc.nextInt();
        sc.close();
    }
    public void MinutestoYears()
    {
        years =  minutes/525600;
        int hours = minutes/60;
        int day = hours/24;
        days = day%365;
    }
    public void display()
    {
        System.out.println("Years : "+years);
        System.out.println("Days : "+days);
    }
    
}
