package com.example.demo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class Dto {
    private String message;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Date date;
}
