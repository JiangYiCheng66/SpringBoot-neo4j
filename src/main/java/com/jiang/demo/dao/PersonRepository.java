package com.jiang.demo.dao;

import com.jiang.demo.entity.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PersonRepository extends Neo4jRepository<Person,Long> {

    Person findByName(String name);
    List<Person> findByTeammatesName(String name);

}
