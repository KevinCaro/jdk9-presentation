package kcs.demo.resource.producer;

import kcs.demo.resource.producer.api.Producer;
import kcs.demo.resource.producer.impl.ProducerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerAutoConfiguration {

    @Bean
    public Producer producer(){
        return new ProducerImpl();
    }

}
