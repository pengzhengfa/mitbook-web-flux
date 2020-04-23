package com.mitbook.router;
import com.mitbook.controller.MitbookHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author pengzhengfa
 */
@Configuration
public class MitbookRouter {

    @Bean
    public RouterFunction<ServerResponse> route(MitbookHandler mitbookHandler) {

        return RouterFunctions
                .route(RequestPredicates.GET("/getUser").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                        mitbookHandler::selectUser);
    }
}