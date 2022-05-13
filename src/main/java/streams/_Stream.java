package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;

public class _Stream {

    static class Person {
        private final String name;
        public final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        Male, Female
    }


    // Main Method
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", Gender.Male),
                new Person("Maria", Gender.Female),
                new Person("Emma", Gender.Female),
                new Person("Pierre", Gender.Male),
                new Person("Huang", Gender.Male),
                new Person("Tung", Gender.Male)

        );

        Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;

        people.stream().map(personStringFunction).mapToInt(length)
                .forEach(println);

    }
}
