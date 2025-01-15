package com.vivek.RestApp.service.impl;

import com.vivek.RestApp.dto.Person;
import com.vivek.RestApp.service.PersonService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
    Person person1 = new Person("Vivek","Delhi","M",21,"B.Tech");
    Person person2 = new Person("Sneha","Delhi","F",21,"B.Tech");
    Person person3 = new Person("Rajan","Odisa","M",20,"BSC");
    Person person4 = new Person("Amrish","Srinagar","M",22,"BCA");
    Person person5 = new Person("Priyanjali","Patna","F",22,"MBA");

    List<Person> personList = new ArrayList<>();

    @Value("${user.gender}")
    String userGender;

    @Override
    public List<Person> getAllPersonData() {
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        return personList;
    }

    @Override
    public List<Person> filterDataBasedOnGender(List<Person> personlist) {
        List<Person> per = new ArrayList<>();
        for(Person obj : personlist){
            if(!userGender.equalsIgnoreCase(obj.getGender())){
                per.add(obj);
            }
        }
        return per;

    }

}
