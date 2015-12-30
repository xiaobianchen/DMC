package com.dmc.controller;

import com.dmc.infrastructure.mongodb.Person;
import com.dmc.infrastructure.mongodb.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.logging.Logger;

/**
 * @author xiaobianchen
 * @version 1.0 2015/12/23
 * @link https://github.com/xiaobianchen/DMC
 * This class is used to handle backend management
 * some mongodb operations
 */
@Controller
@RequestMapping(value = "/support")
public class SupportController {

    @Autowired
    private PersonService personService;

    public static Logger logger = Logger.getLogger(SupportController.class.getName());

    @RequestMapping(method = RequestMethod.GET)
    public String support() {
        return "support";
    }

    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public String log() {
        return "log";
    }


    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public void save() {
        Person person = new Person();
        person.setId("100");
        person.setName("Test");
        person.setAge(30);

        personService.save(person);
        logger.info("save:" + person);
    }

    @RequestMapping(value="/findAll",method = RequestMethod.GET)
    public List<Person> findAll(){
        List<Person> list =  personService.findAll();
        logger.info("Person Info:" + list);
        return list;
    }

}
