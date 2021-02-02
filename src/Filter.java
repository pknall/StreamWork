import java.util.Arrays;
import java.util.List;

public class Filter {


    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Filter based on a boolean test
        // This takes a Predicate predefined functional interface
        // Defn:    Stream<T> filter(Predicate<? super T> action)
        // Means:   Perform "action" on each member in the stream of type T or higher
        //          ("T", the type of the stream, is the most specific / lowest class in the hierarchy)
        integerList.stream()
                .filter(x -> x > 5)
                .forEach(System.out::println);
    }
}
