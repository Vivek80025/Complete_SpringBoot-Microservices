package com.vivek.RestApp.service;

import com.vivek.RestApp.dto.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAllPersonData();
    List<Person> filterDataBasedOnGender(List<Person> personlist);
}
