import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Мария", "Шарапова", 35));
        people.add(new Person("Александр", "Пушкин", 223));
        people.add(new Person("Филипп", "Киркоров", 55));
        people.add(new Person("Алексей", "Шишкин", 11));

        Comparator<Person> comparator = (Person o1, Person o2) -> {
            String[] s1 = o1.getSurname().split(" ", 3);
            String[] s2 = o2.getSurname().split(" ", 3);
            if (s1.length != s2.length) {
                if (o1.getSurname().length() < o2.getSurname().length()) {
                    return -1;
                } else if (o1.getSurname().length() > o2.getSurname().length()) {
                    return 1;
                }
            }
            return Integer.compare(o1.getAge(), o2.getAge());
        };
        Collections.sort(people, comparator);
        System.out.println(people);
    }
    }

