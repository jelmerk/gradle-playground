package nl.orange11.service;

import java.sql.ResultSet;

/**
 * @author Jelmer Kuperus
 */
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        return "hello " + name  + ResultSet.TYPE_SCROLL_INSENSITIVE;
    }
}
