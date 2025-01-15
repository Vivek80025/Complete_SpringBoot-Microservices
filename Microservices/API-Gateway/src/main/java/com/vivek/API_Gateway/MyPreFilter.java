package com.vivek.API_Gateway;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Set;

@Component
public class MyPreFilter implements GlobalFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        ServerHttpRequest request = exchange.getRequest();
        HttpHeaders headers = request.getHeaders();

     /*
        if (!headers.containsKey("Authorization")) {
            // If header is missing, reject the request with HTTP 401 Unauthorized
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();
        }
        // Proceed to the next filter in the chain if validation is passed
        System.out.println("valid user....");

        return chain.filter(exchange);

     */


        Set<String> strings = headers.keySet();

        System.out.println("valid user....");

        return chain.filter(exchange);
    }
}
