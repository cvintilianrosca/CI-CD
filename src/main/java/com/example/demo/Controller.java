package com.example.demo;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class Controller {

    @GetMapping
    public ResponseEntity<String> process(){
        return ResponseEntity.ok("Nanana3");
    }
}
