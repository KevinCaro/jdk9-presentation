package kcs.pres.modules.consumer;

import kcs.pres.modules.producer.api.Producer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.HandlerMapping;
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping;
import org.springframework.web.reactive.socket.server.support.WebSocketHandlerAdapter;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Map;

@Configuration
public class ConsumerApplicationConfig {

    @Bean
    public WebSocketHandlerAdapter handlerAdapter() {
        return new WebSocketHandlerAdapter();
    }

    @Bean
    public Flux<String> producerFlux(Producer producer) {
        return Flux.interval(Duration.ofSeconds(1))
            .map(aLong -> producer.produce())
            .replay(0)
            .autoConnect()
            .doOnCancel(producer::onClientLeft)
            .doOnSubscribe(s -> producer.onClientSubscribe());
    }

    @Bean
    public HandlerMapping webSocketMapping(AppWebSocketHandler webSocketHandler) {
        SimpleUrlHandlerMapping simpleUrlHandlerMapping = new SimpleUrlHandlerMapping();
        simpleUrlHandlerMapping.setUrlMap(Map.<String, Object>of("/", webSocketHandler));
        simpleUrlHandlerMapping.setOrder(10);
        return simpleUrlHandlerMapping;
    }

}
