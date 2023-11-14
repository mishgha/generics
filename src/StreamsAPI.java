import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Stream API
//Following are the functional Interfaces used in Java
//Consumer -> takes single input and returns no result (used as side effect like printing to console and updating an external variable)
//              myList.forEach(var -> System.out.ptintln(str))
//Predicate -> accepts an argument and returns boolean value (used for filtering)
//              myList.stream().filter(str->startsWith("a"))
//Function -> takes one argument and produces a result (mapping)
//              myList.stream().map(String::toUpperCase)
//Supplier -> it has no input arguments and to generate or supply value
//              Stream.generate(()-> new Random().nextInt(100))
public class StreamsAPI {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("apple");
        fruitsList.add("banana");
        fruitsList.add("orange");
        fruitsList.add("grape");
        fruitsList.add("avacado");

        List<String> result = fruitsList.stream()
                .filter(fruit -> fruit.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
