package com.jiang.demo.Service;
import com.jiang.demo.dao.PersonRepository;
import com.jiang.demo.entity.Person;
import com.jiang.demo.utils.Visual;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class Neo4jService {
    @Autowired
    private PersonRepository personRepository;
    //添加用户节点
    public List<Person> GetAllPerson(){
        return personRepository.findAll();
    }

    public Map<String, Object> graph(){
        List<Person> all = personRepository.findAll();
        return Visual.toFormat(all);
    }

}

