package com.test.controller;

import com.test.models.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("")
public class TestController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("")
    public Test test(@RequestParam(value = "name", defaultValue = "world") String defaultName) {
        return new Test(counter.incrementAndGet(), String.format(template, defaultName));
    }
}
