package nl.orange11.service;

/**
 * @author Jelmer Kuperus
 */
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        return "hello " + name;
    }
}
