package com.jiang.demo.controller;
import com.jiang.demo.entity.Person;
import com.jiang.demo.Service.Neo4jService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class Neo4jController {
    @Autowired
    private Neo4jService personService;

    @RequestMapping

    @GetMapping("/Person")
    public List<Person> GetAllPerson() {
        return personService.GetAllPerson();
    }

    @GetMapping("/Overview")
    public Map<String, Object> Overview() {
        return personService.graph();
    }
}

