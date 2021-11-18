package com.sirius.twitter.models;

import lombok.Getter;
import lombok.Setter;

public class User {
    @Getter @Setter
    private int id;

    @Getter @Setter
    private int dni;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private boolean active;
}

