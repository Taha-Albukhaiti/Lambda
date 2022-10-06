import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercise {
    /**
     * Random generator
     */
    private static Random RANDOM_GENERATOR = new Random();
    /**
     * Extracts the list of beverages taht are packed in a specific packaging.
     *
     */
    public static List<Beverage> getBeveragesWithPackaging(Beverage[] beverages, Packaging packaging){
        return Stream.of(beverages).filter(b -> packaging == b.getPackaging()).collect(Collectors.toList());
    }
    /**
     * Computes total volume from a list of beverages
     *
     */
    public static double getTotalVolume(List<Beverage> beverages){
        return beverages.stream().mapToDouble(b -> b.getVolume()).sum();
    }

    public static double getAverageAlcoholAmountOfAlcoholicBeverages(List<Beverage> beverages)throws NoSuchElementException {
        return beverages.stream().filter(Beverage::isContainsAlcohol)
                .mapToDouble(b -> b.getAlacoholAmount())
                .average()
                .orElseThrow(() -> new NoSuchElementException("List does not contain an alcohol"));
    }
}
