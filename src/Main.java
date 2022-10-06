import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void auf(Mathe m, int a, int b){
        int ms = m.fkt(a, b);
        System.out.println(ms);
    }
    public static void main(String[] args){
        Mathe addiere = (int a, int b) -> a + b;
        System.out.println(addiere.fkt(1,2));

        Grosse hi = s -> System.out.println("Hello " + s + "!");
        hi.sagHallo("Taha");

        SagHi hey = s -> "Hello " + s + "!";
        String s = hey.sayHi("ALi");
        System.out.println(s);

        Mathe m = (a, b) -> a + b;

        auf(m, 2, 4);
        auf(m, 2, 22);
        System.out.println();

        List<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(23);
        list.add(24);
        for (Integer integer : list){
            System.out.println(integer);
        }

        System.out.println("***************** ");
        list.forEach(i -> System.out.println(i));
        System.out.println("***************** ");

        Rechner i = (x, y) -> x * y;
        Rechner ii = (x, y) -> x + y;
        Rechner iii = (x, y) -> x - y;
        Rechner iv = (x, y) -> x / y;
        rechenOperation(i, 3, 4);
        rechenOperation(ii, 3,4);
        rechenOperation(iii, 3,4);
        rechenOperation(iv, 18,4);
    }
    public static void rechenOperation(Rechner rechner, int x, int y){
        int i = rechner.rechnen(x,y);
        System.out.println("ist:  " + i);
    }
}


interface Rechner{
    int rechnen(int x, int y);
}
@FunctionalInterface
interface Mathe{
    int fkt(int a, int b);
}

@FunctionalInterface
interface Grosse{
    void sagHallo(String s);
}

@FunctionalInterface
interface SagHi{
    String sayHi(String s);
}