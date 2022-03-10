package programmerzamannow.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmerzamannow.spring.core.service.MerchantServiceImp;

@Configuration
@Import(MerchantServiceImp.class)
public class InheritanceConfiguration {
}
