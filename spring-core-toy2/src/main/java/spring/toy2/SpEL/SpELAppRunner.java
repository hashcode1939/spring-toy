package spring.toy2.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class SpELAppRunner implements ApplicationRunner {

    @Value("#{1+2}")
    int value;

    @Value("#{'spring '+' toy'}")
    String str;

    @Value("#{1 eq 3}")
    boolean equal;

    @Value("${my.greeting}")
    String greeting;

    @Value("#{${my.value} eq 100}")
    boolean isValue100;

    @Value("#{sample.data}")
    int sampleData;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=============");
        System.out.println(value);
        System.out.println(str);
        System.out.println(equal);
        System.out.println(greeting);
        System.out.println(isValue100);
        System.out.println(sampleData);
    }
}
