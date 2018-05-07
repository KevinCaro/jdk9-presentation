package kcs.demo.modules.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class AppWebSocketHandler implements WebSocketHandler {

    private static final Logger LOG = LoggerFactory.getLogger(AppWebSocketHandler.class);

    @Autowired
    private Flux<String> producerFlux;

    @Override
    public Mono<Void> handle(WebSocketSession session) {
        return session.send(
            producerFlux
                .map(session::textMessage)
                .doOnComplete(() -> LOG.info("COMPLETE"))
                .doOnSubscribe(s -> LOG.info("New client connected, session ID: {}", session.getId()))
                .doOnCancel(() -> LOG.info("Client disconnected: {}", session.getId())))
            .log()
            .doOnRequest(value -> LOG.info("ONREQ"))
            .doOnSubscribe(subscription -> LOG.info("ONSUB"))
            .doOnNext(aVoid -> LOG.info("NEXT"));
    }

}
