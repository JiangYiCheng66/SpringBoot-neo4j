package com.jiang.demo.utils;

import com.jiang.demo.entity.Person;
import java.util.*;
import static org.neo4j.helpers.collection.MapUtil.map;


public class Visual {
    public static Map<String, Object> toFormat(List<Person> result) {
        List<Map<String, Object>> nodes = new ArrayList<>();
        List<Map<String, Object>> rels = new ArrayList<>();
        for (Person person : result) {

            Map<String, Object> node = new LinkedHashMap<>();
            node.put("id", person.getId());
            node.put("name", person.getName());
            nodes.add(node);

            Map<String, Object> rel = new LinkedHashMap<>();
            rel.put("relation", person.relation());
            rels.add(rel);
        }
        return map("nodes", nodes, "links", rels);
    }
}
