import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> people = new TreeSet<>(new PersonComporator(2).reversed());
        people.add(new Person("Мария", "Шарапова", 35));
        people.add(new Person("Александр", "Пушкин", 223));
        people.add(new Person("Филипп", "Киркоров", 55));
        people.add(new Person("Алексей", "Шишкин", 11));

        System.out.println(people);

    }
}