package nl.orange11.service;

import java.sql.ResultSet;

/**
 * @author Jelmer Kuperus
 */
public class HelloServiceImpl implements HelloService {

    public String sayBoo(String name) {

        ResultSet resultSet = null; // just here to see if the sonar architecture rule gets picked up by sonar

        return "hello " + name;
    }
}
