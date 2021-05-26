package com.blogapp.blogApp.domains;

import org.springframework.security.core.GrantedAuthority;

public enum Roles implements GrantedAuthority {
    ROLES_ADMIN, ROLES_USER;

    @Override
    public String getAuthority() {
        return name();
    }
}
