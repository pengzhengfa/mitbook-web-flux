package com.mitbook.controller;
import com.mitbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
/**
 * @author pengzhengfa
 */
@Component
public class MitbookHandler {

    @Autowired
    private UserService userService;

    public Mono<ServerResponse> selectUser(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject(""+userService.queryUser()));
    }
}