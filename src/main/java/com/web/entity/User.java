package com.web.entity;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String password;
    private int maxscore;
}
