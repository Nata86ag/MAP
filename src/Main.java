import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Мария", "Шарапова", 35));
        people.add(new Person("Александр", "Пушкин", 223));
        people.add(new Person("Филипп", "Киркоров", 55));
        people.add(new Person("Алексей", "Шишкин", 11));

        System.out.println(people);

        people.removeIf(p -> p.getAge() < 18);
        Collections.sort(people, new PersonComporator(2));
        System.out.println(people);

    }

    ;
}

