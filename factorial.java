import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Enter your factorial number: ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + n + " is: " + fact);

    }
}
