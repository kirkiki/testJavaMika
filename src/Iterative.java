/**
 * Created by Ronan on 23/04.
 */
public class Iterative implements Strategy {

    public int factorial(int end) {
        int var=1;
        if(end==0){
            return 1;
        }else {
            for (int i=2;i<=end;i++){
                var*=i;
            }
            return var;
        }
    }
}
