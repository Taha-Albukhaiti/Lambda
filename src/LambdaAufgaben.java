import java.util.Random;
import java.util.function.*;

public class LambdaAufgaben {

    /*
    1. Eine Funktion, die einen String-Wert erhält und auf einen Double-Wert abbildet
    2. Eine Funktion, die einen Double-Wert x auf x3 + 2x abbildet.
    3. Eine Funktion, die einen Integer-Wert Anzahl erhält und Anzahl oft „Ich mag Java!“ Auf der Konsole ausgibt.
    4. Eine Funktion bildet n auf eine zufällige gerade Zahl von 0 bis n ab.
    5. Eine parameterlose Funktion, die ein zufälliges EU-Land als String zurückgibt.
    6. Eine Funktion, die prüft, ob es sich bei einer gegeben Integer-Zahl um eine Quadratzahl handelt.
     */
    public static void main(String[] args) {
        double d;
        // 1. Eine Funktion, die einen String-Wert erhält und auf einen Double-Wert abbildet
        Function<String, Double> stringToDouble = str -> Double.valueOf(str);
        d = stringToDouble.apply("2.3");
        System.out.println(d);

        //  2. Eine Funktion, die einen Double-Wert x auf x3 + 2x abbildet.
        UnaryOperator<Double> doubleToPolynomial = x -> x * x * x + 2 * x;
        d = doubleToPolynomial.apply(3.0);
        System.out.println(d);

        // 3. Eine Funktion, die einen Integer-Wert Anzahl erhält und Anzahl oft „Ich mag Java!“ Auf der Konsole ausgibt.
        Consumer<Integer> javaIsGreaterRepeater = i -> {
            for (int j = 0; j < i; j++){
                System.out.println("Ich mag Java");
            }
        };
        javaIsGreaterRepeater.accept(3);

        // 4. Eine Funktion bildet n auf eine zufaellige gerade Zahl von 0 bis n ab.
        // Function<Integer, Integer> randomToN = n -> new Random().nextInt(n +1);
        UnaryOperator<Integer> randomToN = n -> new Random().nextInt((n+1)/2)*2;
        for (int i = 0; i < 10; i++) {
            System.out.println(randomToN.apply(10));
        }

        // 5. Eine parameterlose Funktion, die ein zufälliges EU-Land als String zurückgibt.
        Supplier<String> randomLaender = () -> Laender.values()[new Random().nextInt(Laender.values().length)].toString();
        for (int i = 0; i < 3; i++) {
            System.out.println(randomLaender.get());
        }

        // 6. Eine Funktion, die prüft, ob es sich bei einer gegeben Integer-Zahl um eine Quadratzahl handelt.
        Predicate<Integer> isSquareNumber = n -> n == (int) Math.sqrt(n) * (int) Math.sqrt(n);
        for (int i = 0; i < 100; i++) {
            System.out.println("" + i + ": " + isSquareNumber.test(i));
        }

    }
}
