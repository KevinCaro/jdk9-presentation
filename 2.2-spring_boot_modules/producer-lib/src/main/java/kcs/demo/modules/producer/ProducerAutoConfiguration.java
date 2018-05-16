package kcs.demo.modules.producer;

import kcs.demo.modules.producer.api.Producer;
import kcs.demo.modules.producer.impl.ProducerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerAutoConfiguration {

    @Bean
    public Producer producer(){
        return new ProducerImpl();
    }

}
