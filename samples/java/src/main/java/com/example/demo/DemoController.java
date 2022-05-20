package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping()
public class DemoController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping(path = "/test")
    private ResponseEntity<String> descarcaDocument(HttpServletRequest req) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("grant_type", "password");
        map.add("client_id", "login");
        map.add("username", "webposf@gmail.com");
        map.add("password", "1234");

        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(map, headers);

        ResponseEntity<Map> token = restTemplate
                .exchange("https://posf-beta.anre.ro/auth/realms/BROKER/protocol/openid-connect/token",
                        HttpMethod.POST,
                        entity,
                        Map.class);


        HttpHeaders authHeader = new HttpHeaders();
        authHeader.setContentType(MediaType.APPLICATION_JSON);
        authHeader.setBearerAuth((String) Objects.requireNonNull(token.getBody()).get("access_token"));
        HttpEntity<String> authBody = new HttpEntity<>(authHeader);


        return restTemplate
                .exchange("https://posf-beta.anre.ro/broker/list/supplier",
                        HttpMethod.GET,
                        authBody,
                        String.class);


    }

}
