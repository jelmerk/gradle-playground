package nl.orange11.service;

/**
 * @author Jelmer Kuperus
 */
public class HelloServiceImpl implements HelloService {

    public String sayHi(String name) {
        return "hello " + name;
    }
}
