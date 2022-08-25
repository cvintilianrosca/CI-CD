package com.example.demo.dto;

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
public class DemoDto {
    private String message;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Date date;
}
