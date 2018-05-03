package kcs.pres.modules.producer;

import kcs.pres.modules.producer.api.Producer;
import kcs.pres.modules.producer.impl.ProducerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerAutoConfiguration {

    @Bean
    public Producer producer(){
        return new ProducerImpl();
    }

}
