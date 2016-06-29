/**
 * Created by Ronan on 23/04.
 */
public class Factorial {
    private Strategy strategy;

    public  Factorial(Strategy _strategy){
        strategy=_strategy;
    }
    public int doStrategy(int end){
        return strategy.factorial(end);
    }
}
