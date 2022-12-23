import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03_FunctionalInterfaces {


    public static void main(String[] args) {

        List<Integer> numbers = List.of(12,9,13,4,6,2,12,15);
        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
        Function<Integer, Integer> squareFunction = x -> x * x;
        Consumer<Integer> println = System.out::println;
        numbers.stream().filter(isEvenPredicate).map(squareFunction).forEach(println);
    }


}
