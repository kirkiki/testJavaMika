import java.util.Scanner;

/**
 * Created by Ronan on 23/04.
 */
public class Main3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1)Recursive or 2)Iterative?");
        Factorial factorial1 = new Factorial(new Recursive());
        Factorial factorial2 = new Factorial(new Iterative());

        int val = scanner.nextInt();
        System.out.println("enter a number");
        if (val == 1) {
            val = scanner.nextInt();
            System.out.println("Recursive : " + factorial1.doStrategy(val));
        }
        else if (val == 2) {
            val = scanner.nextInt();
            System.out.println("Iterative : " + factorial2.doStrategy(val));
        } else
            System.out.println("Ultimate answer: 42");
    }
}
