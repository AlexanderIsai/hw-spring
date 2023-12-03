package com.myhomeworks.hwspring.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bean {
    private String name;

    public Bean() {
        System.out.println("Bean is ready");
    }
}
