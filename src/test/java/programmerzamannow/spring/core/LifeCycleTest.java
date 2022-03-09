package programmerzamannow.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.spring.core.data.Connection;

public class LifeCycleTest {

    private ApplicationContext applicationContex;

    @BeforeEach
    void setUp() {
        applicationContex = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    }

    @Test
    void testConnection() {

        Connection connection = applicationContex.getBean(Connection.class);

    }
}
