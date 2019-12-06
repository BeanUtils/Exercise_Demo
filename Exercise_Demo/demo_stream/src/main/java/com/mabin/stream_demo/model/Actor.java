package com.mabin.stream_demo.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
public class Actor {

    public Actor(String name) {
        this.name = name;
    }

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private String address;

}
