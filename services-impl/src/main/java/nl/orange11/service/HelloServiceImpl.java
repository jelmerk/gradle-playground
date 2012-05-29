package nl.orange11.service;

import java.sql.ResultSet;

/**
 * @author Jelmer Kuperus
 */
public class HelloServiceImpl implements HelloService {

    public String sayBoo(String name) {

        // just here to see if the sonar architecture rule gets picked up by sonar
        System.out.println(ResultSet.TYPE_SCROLL_INSENSITIVE);

        return "hello " + name;
    }
}
