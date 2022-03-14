package programmerzamannow.spring.core;

import org.springframework.context.annotation.Bean;
import programmerzamannow.spring.core.data.Foo;

public class ContohBean {


    @Bean
    public Foo foo(){

        return new Foo();

    }
}
