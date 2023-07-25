package ru.alishev.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.alishev.springcourse.models.Person;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
    //поиск людей по имени
    List<Person> findByName(String name);

    //список людей, отсортированный по возрасту
    List<Person> findByNameOrderByAge(String name);

    //поиск людей по email
    List<Person> findByEmail(String name);

    //поиск людей по введеным буквам(словам)
    List<Person> findByNameStartingWith(String startingWith);

    //поиск людей по имени или майлу
    List<Person> findByNameOrEmail(String name, String email);
}
