import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Iterate and print to console
        // This takes a Consumer predefined functional interface and is a terminal operation.
        // Defn:    void forEach(Consumer<? super T> action)
        // Means:   Perform "action" on each member in the stream of type T or higher
        //          ("T", the type of the stream, is the most specific / lowest class in the hierarchy)
        integerList.stream()
                .forEach(System.out::println);

        // Same as above using a lambda expression
        integerList.stream()
                .forEach(x -> System.out.println(x));
              //.forEach(x -> x + 1);     // Bad return type for lambda expression; int cannot be converted to void
    }
}
