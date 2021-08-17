package com.bom.streams;

import javax.jnlp.PersistenceService;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class MaxAndComparator {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person("fijutsu",28,"Japan");
        Person p2 = new Person("vladmir putin",65,"Russia");
        Person p3 = new Person("Ram",24,"India");
        Person p4 = new Person("pankaj",19,"India");
        personList.add(p1);personList.add(p2);personList.add(p3);personList.add(p4);
        System.out.println("Oldest   Person is  :: "+ findOldPerson(personList));
        System.out.println(" Youngest Person is :: "+ findYoungPerson(personList));
    }

public static Person findOldPerson(List<Person> persons) {
      //  persons.stream().filter(s-> s.getAge()).max(s->s.getAge()).get();
        return    persons.stream().max(Comparator.comparing(Person :: getAge)).orElseThrow(NoSuchElementException::new);
}
    public static Person findYoungPerson(List<Person> persons) {
        //  persons.stream().filter(s-> s.getAge()).max(s->s.getAge()).get();
        return    persons.stream().min(Comparator.comparing(Person :: getAge)).orElseThrow(NoSuchElementException::new);
    }
}
