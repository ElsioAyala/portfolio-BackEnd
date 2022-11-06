package com.portfolio.elsio.security.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author elsio
 */

@Getter @Setter
public class LoginUser {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
    
}
