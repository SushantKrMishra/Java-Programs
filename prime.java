import java.util.*;

class PrimeTest {
    public int num = 0;
    public static char ch = 'N';
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        PrimeTest P1 = new PrimeTest();
        do {

            P1.input();
            P1.display();
        } while (ch != 'N');
    }

    public void input() {

        System.out.println("Please Enter the number for prime number Check :");
        num = sc.nextInt();
    }

    public boolean Check(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        if (Check(num) == true) {
            System.out.println("The Entered number is not prime;");

        } else {
            System.out.println("The Entered number is prime;");
        }
        System.out.println("Do You want to Continue? Y|N : ");
        ch = sc.next().charAt(0);
    }
}