package AdditionalTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Lambda {
    static List<String> places = new ArrayList<>();

    public static List getPlaces(){
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

        return places;

    }
    public static void main(String[] args) {
        //Functional a = () -> 2;
        //System.out.println("Number is " + a.getNum());
        System.out.println("---------------------------");
        List<String> myPlace = getPlaces();

            myPlace.stream()
                    .filter((p) -> p.startsWith("Nepal"))
                    //.map((p) -> p.toUpperCase())
                    .sorted()
                    .forEach((p) -> System.out.println(p));

            Functional m = () -> {
            return "Hello world";
            };
        System.out.println(m.write());
    }
}
