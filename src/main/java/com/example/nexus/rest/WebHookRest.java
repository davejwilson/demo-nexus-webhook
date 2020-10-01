package com.example.nexus.rest;

import com.example.nexus.model.ComponentEvent;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class WebHookRest {
    @PostMapping(path = "/webhook", consumes = "application/json", produces = "application/json")
    public String addWebHook(
            @RequestBody ComponentEvent event,
            @RequestHeader Map<String, String> headers
            ) {
        System.out.println("headers=" + headers);
        System.out.println(event);
        return "success";
    }
}
