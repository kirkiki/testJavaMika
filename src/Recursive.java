/**
 * Created by Ronan on 23/04.
 */
public class Recursive implements Strategy {

    public int factorial(int end) {
        if (end==0){
            return 1;
        }else {
            return end*factorial(end-1);
        }
    }
}
