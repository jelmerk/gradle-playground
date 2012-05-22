package nl.orange11.service;

/**
 * @author Jelmer Kuperus
 */
public class HelloServiceImpl implements HelloService {

    public String sayBoo(String name) {
        return "hello " + name;
    }
}
