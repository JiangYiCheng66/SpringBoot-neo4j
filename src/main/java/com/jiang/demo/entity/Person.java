package com.jiang.demo.entity;
import java.io.Serializable;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;



@Data
@Node
public class Person implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Property
    private String name;

}
