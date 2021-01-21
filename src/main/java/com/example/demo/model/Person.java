package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.UUID;

public class Person {
    private final UUID id;
    @NotNull
    private final String Name;

    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name) {
        this.id = id;
        Name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return Name;
    }
}
