package fr.umlv.stream;

import java.util.List;
import java.util.stream.Stream;

public class Streams {
  public record Person(String name, int age) {}

  public static List<String> namesOfTheAdults(List<Person> persons) {

    Stream<Person> adults = persons.stream().filter(p-> p.age >=18);
    List<String> adultsNames = adults.map(Person::name).toList();
    return adultsNames;
  }

  public static void main(String[] args) {
    var persons = List.of(
        new Person("Ana", 21),
        new Person("John", 17),
        new Person("Liv", 29));
    var names = namesOfTheAdults(persons);
    System.out.println(names);
  }
}
