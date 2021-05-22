import java.util.Scanner;

public class switchcase{
    public static void main(String[] Args){
        int choice;
        System.out.println("Choices");
        System.out.println("1.hi\t2.hello\t3.hey\t");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Hi");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Hey");
                break;
        
            default:
                System.out.println("Default");
                break;
        }
    }
    }