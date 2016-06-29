import java.util.Scanner;

/**
 * Created by Ronan on 23/04.
 */
public class Main {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        int val=scanner.nextInt();
        System.out.println(factorial(val));

    }
    public static int factorial(int _end){
        int var=1;
        if(_end==0){
            return 1;
        }else {
            for (int i=2;i<=_end;i++){
                var*=i;
            }
            return var;
        }
    }
}
