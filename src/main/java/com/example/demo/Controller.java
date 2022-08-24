package com.example.demo;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/")
public class Controller {

    @GetMapping
    public ResponseEntity<Dto> process(){
        Dto dto = new Dto();
        dto.setMessage("This is a test, let's see the change!");
        dto.setDate(new Date());
        return ResponseEntity.ok(dto);
    }
}
