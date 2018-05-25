package kcs.demo.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class ServiceHandler {

    @Autowired
    private Flux<String> producerFlux;

    public Mono<ServerResponse> handle(ServerRequest request){
        return ok()
            .contentType(MediaType.TEXT_EVENT_STREAM)
            .body(producerFlux, String.class);
    }

}
