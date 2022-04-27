package imperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {


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

  public static void main(String[] args) {

    List<Person> people = Arrays.asList(
        new Person("John", Gender.Male),
        new Person("Maria", Gender.Female),
        new Person("Emma", Gender.Female),
        new Person("Pierre", Gender.Male),
        new Person("Huang", Gender.Male),
        new Person("Tung", Gender.Male)

    );

// Imperative approach
    System.out.println("approach approach");
    List<Person> females = new ArrayList<>();
    for (Person female : people) {
      if (Gender.Female.equals(female.gender)) {
        females.add(female);
      }
    }
    for (Person female : females) {
      System.out.println(female.toString());
    }

// Declarative approach
    System.out.println("Declarative approach");
    Predicate<Person> personPredicate = person -> Gender.Female.equals(person.gender);
    List<Person> females2 = people.stream().filter(personPredicate)
        .collect(Collectors.toList());
    females2.forEach(System.out::println);
  }

}
