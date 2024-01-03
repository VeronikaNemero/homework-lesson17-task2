import java.util.function.Predicate;

public class Positive {

    public static void isPositive(int[] numbers){
        for (int number : numbers) {
            Predicate<Integer> isPositive = x -> x > 0;
            if(isPositive.test(number)){
                System.out.println(number);
            }
        }
    }
}
