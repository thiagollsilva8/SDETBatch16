package class26;

/*
In Test Class, create a Map that will store key in ascending order. In that map store personId and a Person Object.
Print each object detail.
 */

import java.util.Map;
import java.util.TreeMap;

public class PersonTester {

    public static void main(String[] args) {

        Map<String, Person> people = new TreeMap<>();
        people.put("00010", new Person("Bruce", "Wayne", 30, 500000.00));
        people.put("01003", new Person("Clark", "Kent", 28, 75000));
        people.put("00001", new Person("Diana", "Prince", 5000, 150000));

        for (var s : people.entrySet()) {
            System.out.println(s.getKey()+" "+s.getValue());
        }
    }
}
