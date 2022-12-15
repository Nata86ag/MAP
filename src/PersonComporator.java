import java.util.Comparator;

public class PersonComporator implements Comparator<Person> {
    public int maxWord;

    public PersonComporator(int maxWord) {
        this.maxWord = maxWord;
    }


    @Override
    public int compare(Person o1, Person o2) {
        int s1 = o1.getSurname().split("(?U)\\W").length;
        int s2 = o2.getSurname().split(" (?U)\\W").length;

        if (s1 >= maxWord && s2 >= maxWord) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }

        if (s1 > s2) {
            return 1;
        } else if (s1 == s2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return -1;
    }
}