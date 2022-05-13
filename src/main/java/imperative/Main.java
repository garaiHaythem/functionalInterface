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
    int[] c =  sortedArrayMerge(new int[]{1, 3, 4, 5}, new int[]{2, 4, 6, 8});
    for (int a : c ){
      System.out.println(a);
    }

  }


  public static int[] sortedArrayMerge(int a[], int b[]) {
    int result[] = new int[a.length +b.length];
    int i =0; int j = 0;int k = 0;
    while(i<a.length && j <b.length) {
      if(a[i]<b[j]) {
        result[k++] = a[i];
        i++;
      } else {
        result[k++] = b[j];
        j++;
      }
    }
    System.arraycopy(a, i, result, k, (a.length -i));
    System.arraycopy(b, j, result, k, (b.length -j));
    return result;
  }


}
