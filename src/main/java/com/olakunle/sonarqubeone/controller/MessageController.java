package com.olakunle.sonarqubeone.controller;


import com.olakunle.sonarqubeone.serviceimpl.MessageServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MessageController {

    private final MessageServiceImpl messageServiceImpl;

    @GetMapping("/welcome")
    public String getWelcomeMessage() {

        return  messageServiceImpl.getMessage();
    }
}
