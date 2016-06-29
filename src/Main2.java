import java.util.Scanner;

/**
 * Created by Ronan on 23/04.
 */
public class Main2 {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        int val=scanner.nextInt();
        System.out.println(factorial(val));

    }

    private static int factorial(int val) {
        if (val==0){
            return 1;
        }else {
            return val*factorial(val-1);
        }
    }
}
