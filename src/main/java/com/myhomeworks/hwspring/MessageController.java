package com.myhomeworks.hwspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class MessageController {

    private String greeting = "Добро пожаловать";
    private String noGreeting = "Мы Вам не рады";
    private int count = 0;

    private List<Integer> counts = new ArrayList<>();

    @GetMapping(value = "/message")
    public String someString() {
        Random random = new Random();
        return (random.nextBoolean()) ? greeting : noGreeting;
    }

    @GetMapping(value = "/count")
    public void increaseCount() {
        count++;
    }

    @GetMapping(value = "/info")
    public int showCount() {
        return count;
    }

    @GetMapping(value = "/save-and-reset")
    public void addCounterToList() {
        counts.add(count);
        count = 0;
    }

    @GetMapping(value = "/list")
    public List<Integer> showList() {
        return counts;
    }
}
