package com.dmc.infrastructure.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2015/12/30
 * @link https://github.com/xiaobianchen/DMC
 */
@Service
public class PersonService {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void save(Person person) {
        mongoTemplate.save(person,"person");
    }


    public List<Person> findAll() {
        return mongoTemplate.findAll(Person.class);
    }
}
