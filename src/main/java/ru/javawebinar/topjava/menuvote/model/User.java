package ru.javawebinar.topjava.menuvote.model;

import java.util.Date;
import java.util.Set;

public class User {
    private Integer id;
    private String userName;
    private String email;
    private String password;
    private boolean enabled;
    private Date registered;
    private Set<Role> roles;
}
