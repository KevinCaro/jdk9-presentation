package kcs.demo.service;

import kcs.demo.resource.producer.api.Producer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;

import java.time.Duration;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class AppConfig {

    @Bean
    public RouterFunction<ServerResponse> producerStreamRoute(ServiceHandler handler) {
        return route(GET("/my-acronyms"), handler::handle);
    }

    @Bean
    public Flux<String> producerFlux(Producer producer) {
        return Flux.interval(Duration.ofSeconds(3))
            .map(aLong -> producer.produce())
            .replay(0)
            .autoConnect()
            .doOnCancel(producer::onClientLeft)
            .doOnSubscribe(s -> producer.onClientSubscribe());
    }

}
