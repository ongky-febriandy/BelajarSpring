package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.spring.core.service.MerchantService;
import programmerzamannow.spring.core.service.MerchantServiceImp;

public class InheritanceTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        applicationContext.registerShutdownHook();
    }


    @Test
    void testInheritance() {

        MerchantService merchantService = applicationContext.getBean(MerchantService.class);
        MerchantServiceImp merchantServiceImp = applicationContext.getBean(MerchantServiceImp.class);

        Assertions.assertSame(merchantService, merchantServiceImp);
    }
}
