package com.javanauta.bffagendadortarefas.infrastructure.security;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@SecurityScheme(type = SecuritySchemeType.HTTP, name = SecurityConfig.SECURITY_SCHEME,
        bearerFormat = "JWT", scheme = "bearer")
public class SecurityConfig {

    public static final String SECURITY_SCHEME = "bearerAuth";
}
