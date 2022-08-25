package com.example.demo.controller;

import com.example.demo.dto.DemoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/")
public class Controller {
    private static final String THIS_IS_A_TEST = "This is a second test!";
    @GetMapping
    public ResponseEntity<DemoDto> process(){
        final DemoDto dto = new DemoDto();
        dto.setMessage(THIS_IS_A_TEST);
        dto.setDate(new Date());

        return ResponseEntity.ok(dto);
    }
}
