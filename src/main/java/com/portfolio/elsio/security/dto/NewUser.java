package com.portfolio.elsio.security.dto;

import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author elsio
 */
@Getter @Setter
public class NewUser {
    private String name;
    private String userName;
    private String email;
    private String password;
    private Set<String> roles = new HashSet<>();
}
