package com.vivek.RestApp.controller;

import com.vivek.RestApp.dto.Person;
import com.vivek.RestApp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class TinderController {
    @Autowired
    PersonService personService;

    @GetMapping("/getPersons")
    public List<Person> getAllPerson(){
        List<Person> allPersonData = personService.getAllPersonData();
        //filter the data based on the user gender or app-property
        List<Person> filterData = personService.filterDataBasedOnGender(allPersonData);
        return filterData;
    }

    @PostMapping("/create-person")
    public String createUser(@RequestBody Person person){
        return "Data insert successfully";
    }
}
