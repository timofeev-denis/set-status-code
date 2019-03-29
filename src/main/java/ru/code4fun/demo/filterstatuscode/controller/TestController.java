package ru.code4fun.demo.filterstatuscode.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by: Denis Timofeev
 * Date: 29.03.2019
 */

@RestController
public class TestController {

    @GetMapping("/string")
    public String testString() {
        return "OK";
    }

    @GetMapping("/entity")
    public ResponseEntity<String> testResponseEntity() {
        return ResponseEntity.ok("OK");
    }
}
