import java.util.*;
import java.util.stream.Collectors;

public class YLab_StreamPerson {
    static class Person {
        final int id;

        final String name;

        Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person person)) return false;
            return getId() == person.getId() && getName().equals(person.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId(), getName());
        }
    }

    private static Person[] RAW_DATA =
//            null;     // ���������, ��� Optional �� null ��������
            new Person[]{
//                    null}; // ���������, ��� ����� �� null ��������

            new Person(0, "Harry"),
            new Person(2, "Harry"),
            new Person(0, "Harry"), // ��������
            new Person(1, "Harry"), // ����
            new Person(5, "Amelia"),
            new Person(4, "Jack"),
            new Person(4, "Jack"),
            new Person(7, "Amelia"),
            new Person(6, "Amelia"),
            new Person(3, "Emily"),
            new Person(5, "Amelia"),
            new Person(8, "Amelia"),};
        /*  Raw data:

        0 - Harry
        0 - Harry
        1 - Harry
        2 - Harry
        3 - Emily
        4 - Jack
        4 - Jack
        5 - Amelia
        5 - Amelia
        6 - Amelia
        7 - Amelia
        8 - Amelia

        **************************************************

        Duplicate filtered, grouped by name, sorted by name and id:

        Amelia:
        1 - Amelia (5)
        2 - Amelia (6)
        3 - Amelia (7)
        4 - Amelia (8)
        Emily:
        1 - Emily (3)
        Harry:
        1 - Harry (0)
        2 - Harry (1)
        3 - Harry (2)
        Jack:
        1 - Jack (4)
     */

    public static void main(String[] args) {
//        System.out.println("Raw data:");
//        System.out.println();
//
//        for (Person person : RAW_DATA) {
//            System.out.println(person.id + " - " + person.name);
//        }
//
//        System.out.println();
//        System.out.println("**************************************************");
//        System.out.println();
//        System.out.println("Duplicate filtered, grouped by name, sorted by name and id:");
//        System.out.println();

        /*
        Task1
            ������ ���������, ������������� �� ��������������, ������������� �� �����

            ��� ������ ����������
                Key: Amelia
                Value:4
                Key: Emily
                Value:1
                Key: Harry
                Value:3
                Key: Jack
                Value:1
         */
        Optional.ofNullable(RAW_DATA)
                .stream()
                .flatMap(Arrays::stream)
                .filter(Objects::nonNull)
                .distinct()
                .sorted(Comparator.comparingInt(Person::getId))
//                .forEach(person-> System.out.println(person.id + " - " + person.name)); // �������� ������������ �� id
                .collect(Collectors.toMap(key -> key.name, value -> 1, Integer::sum))
                .forEach((key, value) -> System.out.println("Key: " + key + "\n" + "Value: " + value));

//        System.out.println();
//        System.out.println("**************************************************");
//        System.out.println();


    }
}