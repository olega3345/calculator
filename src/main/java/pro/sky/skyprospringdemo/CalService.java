package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String hello() {
        return "<b>hello</b>";
    }

    public String answerhello(String userName) {
        return "<b>hello</b> " + userName;

    }
}

